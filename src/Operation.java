import javax.management.OperationsException;

public class Operation {
    static String division(String str, int num) {
        return str.substring(0, str.length() / num);
    }
    static String minus(String str1, String str2) {
        return str1.replace(str2, "");
    }
    static String mult(String str, int num) {
        return str.repeat(num);
    }
    static String plus(String str1, String str2) {
        return str1 + str2;
    }
}








