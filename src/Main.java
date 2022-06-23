import javax.management.OperationsException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, OperationsException {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Выполните операцию: сложения строк, вычитания строки из строки,\n " +
                "умножения строки на число и деления строки на число.\n " +
                "Строки выделяй в кавычки!\n " +
                "Пробелы перед и после знаком операции обязательны!");
        String[] inputStr = scanner.nextLine().split("[\"]");

        if (inputStr.length >= 4) {
            String strOne = inputStr[1];
            String strTwo = inputStr[3];
            String operator = inputStr[2];

            if (strOne.length() > 0 && strOne.length() <= 10 && strTwo.length() > 0 && strTwo.length() <= 10) {

                Check.operationString(strOne, operator, strTwo);
            } else {
                System.out.println("Вы ввели слишком длинное слово. Введите строки длинной не более 10 символов.");
                return;
            }
        } else if (inputStr.length == 3){

            String operator = inputStr[2];

        if (operator.contains(" * ")) {
                operator = " * ";
            } else if (operator.contains(" / ")) {
                operator = " / ";
            }else {
                System.out.println("Вы ввели арифметическую операцию не отвечающую условию. Введите + - * /" );
                return;
            }
                String strOne = inputStr[1];

                String strNum = inputStr[2].replaceAll("[^0-9]", "");
               int number = Integer.parseInt(strNum);

            if (number >= 0 && number <= 10 && strOne.length() > 0 && strOne.length() <= 10) {

                Check.operationStringNum(strOne, operator, number);
            } else {
                System.out.println("Вы ввели слишком большое число или слово. Введите число от 0 до 10 включительно,\n" +
                        "Введите строки длинной не более 10 символов. ");
                return;
            }
        } else {
            throw new RuntimeException("Некорректный ввод");
        }
    }
}




