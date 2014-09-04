package Practice14_calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("please input expression:");
            String expression = getInput();
            double result;
            try {
                result = calculator.calculate(expression);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("something wrong");
            }
        }
    }

    private static String getInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("error");
        }
        return null;
    }
}
