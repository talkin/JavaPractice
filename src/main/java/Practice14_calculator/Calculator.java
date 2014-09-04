package Practice14_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Calculator {

    List<Double> params = new ArrayList<Double>();
    List<Operation> operations = new ArrayList<Operation>();

    public double calculate(String expression) {

        params = getParam(expression);
        operations = getOperation(expression);

        double result = params.get(0);

        for (int i=1; i<params.size(); i++) {
            double param = params.get(i);
            Operation operation = operations.get(i-1);
            result = operation.execute(result, param);
        }

        return result;
    }

    private List<Operation> getOperation(String expression) {
        Pattern pattern = Pattern.compile("\\d+");
        String[] operas = pattern.split(expression);
        operations.clear();
        for (int i=1; i< operas.length; i++) {
            Operation ope = Operation.getOperation(operas[i]);
            operations.add(ope);
        }
        return operations;
    }

    private List<Double> getParam(String expression) {
        Pattern pattern = Pattern.compile("\\D+");
        String[] paramsString = pattern.split(expression);
        double param;
        params.clear();
        for (int i=0; i<paramsString.length; i++) {
            param = Double.parseDouble(paramsString[i]);
            params.add(param);
        }
        return params;
    }

}
