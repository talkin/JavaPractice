package Practice14_calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("please input expression:");
            String expression = getInput();
            double result;
            result = calculator.calculate(expression);
            System.out.println(result);
        }
    }

    private static String getInput() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new Exception("something wrong.");
        }
    }
}
