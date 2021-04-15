import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите первое число:");
            int operand1 = scanner.nextInt ();
            System.out.println("Введите операцию:");
            char operation = scanner.next (). charAt(0);
            System.out.println("Введите второе число:");
            int operand2 = scanner.nextInt();
            int result = 0;
            switch (operation){
                case '+':
                    result = operand1 + operand2;
                    System.out.println(result);
                    break;
                case '-':
                    result = operand1 - operand2;
                    System.out.println(result);
                    break;
                case '*':
                    result = operand1 * operand2;
                    System.out.println(result);
                    break;
                case '/':
                    result = operand1 / operand2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

