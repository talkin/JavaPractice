package Practice14_calculator;

public enum Operation {
    ADD("+") {
        @Override
        double execute(double one, double two) {
            return one + two;
        }
    },

    SUBTRACT("-") {
        @Override
        double execute(double one, double two) {
            return one - two;
        }
    },

    MULTIPLY("*") {
        @Override
        double execute(double one, double two) {
            return one * two;
        }
    },

    DIVIDE("/") {
        @Override
        double execute(double one, double two) {
            return one / two;
        }
    };

    private String operator;
    Operation(String operator) {
        this.operator = operator;
    }

    abstract double execute(double one, double two);

    public static Operation getOperation(String operator) {
        for (Operation operation : values() ) {
            if (operation.operator.equals(operator)) {
                return operation;
            }
        }
        return null;
    }
}
