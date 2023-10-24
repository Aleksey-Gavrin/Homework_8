import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Задача 1
//        Объявите три массива:
//        - Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
//        - Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
//        - Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
//          с помощью ключевого слова или сразу заполненный элементами.

        int[] integerNumbers = new int[3];
        integerNumbers[0] = 1;
        integerNumbers[1] = 2;
        integerNumbers[2] = 3;

        double[] fractionalNumbers = {1.57, 7.654, 9.986};

        char[] symbols = {'a', 'r', 'r', 'a', 'y'};

//        Задача 2
//        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
//        В конце строки запятую ставить не надо.

        System.out.println();
        System.out.println("Результат выполнения задачи 2:");

        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(integerNumbers[i]);
            }
            else {
                System.out.print(integerNumbers[i] + ", ");
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(fractionalNumbers[i]);
            }
            else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(symbols[i]);
            }
            else {
                System.out.print(symbols[i] + ", ");
            }
        }

//        Задача 3
//        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки
//        запятую ставить не надо.

        System.out.println();
        System.out.println("Результат выполнения задачи 3:");

        for (int i = 2; 0 <= i; i--) {
            if (i == 0) {
                System.out.println(integerNumbers[i]);
            }
            else {
                System.out.print(integerNumbers[i] + ", ");
            }
        }
        for (int i = 2; 0 <= i; i--) {
            if (i == 0) {
                System.out.println(fractionalNumbers[i]);
            }
            else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        for (int i = 4; 0 <= i; i--) {
            if (i == 0) {
                System.out.println(symbols[i]);
            }
            else {
                System.out.print(symbols[i] + ", ");
            }
        }

//        Задача 4
//        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
//        Распечатайте результат преобразования в консоль.

        System.out.println();
        System.out.println("Результат выполнения задачи 4:");

        for (int i = 0; i < integerNumbers.length; i++) {
            if (integerNumbers[i] % 2 != 0) {
                integerNumbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integerNumbers));
    }
}