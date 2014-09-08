package Practice14_calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Calculator {

    public double calculate(String expression) throws Exception {

        Pattern parseOperas = Pattern.compile("\\d+");
        String[] oldOperas = parseOperas.split(expression);
        String[] newOperas = Arrays.copyOfRange(oldOperas, 1, oldOperas.length);
        List<Operation> operations = getElement(newOperas, new Convertor<Operation>() {
            @Override
            public Operation convert(String srcStr) throws Exception {return Operation.getOperation(srcStr);
            }
        });

        Pattern parseParams = Pattern.compile("\\D+");
        String[] params = parseParams.split(expression);
        List<Double> parameters = getElement(params, new Convertor<Double>() {
            @Override
            public Double convert(String srcStr) throws Exception {return Double.parseDouble(srcStr);
            }
        });

        double result = parameters.get(0);

        for (int i=1; i< parameters.size(); i++) {
            double param = parameters.get(i);
            Operation operation = operations.get(i-1);
            result = operation.execute(result, param);
        }
        return result;
    }

    private <E> List<E> getElement(String[] expression, Convertor<E> convertor) throws Exception {
        List<E> result = new ArrayList<E>();
        for (String expressionSym : expression) {
            result.add(convertor.convert(expressionSym));
        }
        return result;
    }
}

abstract class Convertor<T> {
    public abstract T convert(String srcStr) throws Exception;
}

