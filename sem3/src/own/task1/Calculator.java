/*Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */

package own.task1;

public class Calculator {

        public static <T extends Number, U extends Number> Double sum(T a, U b) {
            Double num1 = a.doubleValue();
            Double num2 = b.doubleValue();
            return num1 + num2;
        }

        public static <T extends Number, U extends Number> Double subtract(T a, U b) {
            Double num1 = a.doubleValue();
            Double num2 = b.doubleValue();
            return num1 - num2;
        }

        public static <T extends Number, U extends Number> Double multiply(T a, U b) {
            Double num1 = a.doubleValue();
            Double num2 = b.doubleValue();
            return num1 * num2;
        }

        public static <T extends Number, U extends Number> Double divide(T a, U b) {
            Double num1 = a.doubleValue();
            Double num2 = b.doubleValue();
            if (num2 == 0) throw new ArithmeticException("деление на нуль");
            return num1 / num2;
        }



        public static void main(String[] args) {
            System.out.println("sum");
            System.out.println(sum(3, 8));
            System.out.println(sum(3, 7.7));
            System.out.println(sum(3.5, 7.7));
            System.out.println("subtract");
            System.out.println(subtract(13, 8));
            System.out.println(subtract(3, 7.7));
            System.out.println(subtract(3.5, 7.7));
            System.out.println("multiply");
            System.out.println(multiply(3, 8));
            System.out.println(multiply(3, 7.7));
            System.out.println(multiply(3.5, 7.85));
            System.out.println("division");
            System.out.println(divide(3, 8));
            System.out.println(divide(3, 7.7));
            try {
                System.out.println(divide(3.5, 0));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
}




