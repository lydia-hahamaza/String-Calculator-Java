import javax.management.OperationsException;

public class Check {
    public static String operationString(String str1, String operand, String str2) throws OperationsException {

        String result;
        switch (operand) {
            case " + ":
                result = Operation.plus(str1, str2);
                break;
            case " - ":
                result = Operation.minus(str1, str2);
                break;
            default:
                throw new OperationsException("Неверный знак операции");
        }
        if (result.length() > 40) {
            String res = result.substring(0, 40);
            System.out.println("\"" + res + "..." + "\"");
        } else {
            System.out.println("\"" + result + "\"");
        }
        return result;
    }

    public static String operationStringNum (String str1, String operand, int num) throws OperationsException {
        String result;
        switch (operand) {
            case " * ":
                result = Operation.mult(str1, num);
                break;
            case " / ":
                try {
                    result = Operation.division(str1, num);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!");
                }
            default:
                throw new OperationsException("Неверный знак операции");
        }
        if (result.length() > 40) {
            String res = result.substring(0, 40);
            System.out.println("\"" + res + "..." + "\"");
        } else {
            System.out.println("\"" + result + "\"");
        }
        return result;
    }
}



