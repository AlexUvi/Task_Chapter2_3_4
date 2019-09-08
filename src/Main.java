/**
2.1 В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления
q на w с остатком.
 */
//    import  java.util.Scanner;
//
//    public class Main {
//
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите целое число: ");
//            byte delimoe = in.nextByte();
//            System.out.println("Введите делитель: ");
//            byte delitel = in.nextByte();
//            System.out.println(delimoe + "/" + delitel + " = " + delimoe/delitel + " и " + delimoe%delitel + " в остатке");
//        }
//    }

/**
 2.2 В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму
 цифр числа n.
 */
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите натуральное двузначное число: ");
//        byte number = in.nextByte();
//        System.out.println("Сумма цифр числа = " + (number / 10 + number % 10));
//    }
//}

/**
 2.4 В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран
 сумму цифр числа n.
 */
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите трёхзначное число: ");
//        short number = in.nextShort();
//        System.out.println("Сумма чисел трёхзн. числа = " + (number/100 + (number/10)%10 + number%10));
//    }
//}

/**
 3.1 Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов без использования функции Math.toDegrees(n).
 */
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите величину угла в град.: ");
//        short n = in.nextShort();
//        float n1 = (float) Math.cos(Math.toRadians(n));
//        System.out.println("cos угла " + n + " град. равен = " + n1);
//        float n2 = (float)Math.cos(Math.PI / 4);
//        System.out.println("cos угла 45 град. равен = " + n2);
//    }
//}

/**
  Вычислить и вывести на экран количество цифр в числе
 */
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
////        System.out.println("Введите натуральное положительное число: ");
////        Scanner in = new Scanner(System.in);
////        String number = in.next();
////        int kol = number.length();
////        System.out.println("Количество цифр в числе: " + kol);
//
//        System.out.println("Введите натуральное положительное число: ");
//        Scanner in = new Scanner(System.in);
//        int chislo = in.nextInt();
//        chislo = getCountsOfDigits(chislo);
//        System.out.println("Количество цифр в числе: "+ chislo);
//    }
//    public static int getCountsOfDigits(int number) {
//        int count = (number == 0) ? 1 : 0;
//        while (number != 0) {
//            count++;
//            number /= 10;
//        }
//        return count;
//    }
//}

/**
 функция сигнум FunctionSignum
 */
////import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
////      Scanner in = new Scanner(System.in);
//        float a = 3.565f;
//        float b = 0.0f;
//        float c = -3.4544f;
//        double signum_a = Math.signum(a);
//        double signum_b = Math.signum(b);
//        double signum_c = Math.signum(c);
//        System.out.println(signum_a);
//        System.out.println(signum_b);
//        System.out.println(signum_c);
//    }
//}

/**
 * 3.2 Натуральное положительное число записано в переменную n. Создайте программу, которая будет генерировать и
 * выводить на экран целое псевдослучайное число из отрезка [-n;n]
 */
//import  java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Случайное вещ. число из промежутка [-3;3): " + '\n' + (Math.random()*6 - 3)); // [-3;3)
//        System.out.println();
//
//        System.out.print("Введите число n: "  + '\t');
//        Scanner in = new Scanner(System.in);
//        byte n = in.nextByte();
//        System.out.println("Случайное целое число из отрезка " + '\u005b' + '-' + n + ';' + n + '\u005d' + ": "
//                + ((int)(Math.random()*(2*n + 1)) -n)); // [-n;n]
//        System.out.println();
//
//        System.out.print("Введите начало отрезка а:"  + '\t');
//        byte a = in.nextByte();
//        System.out.print("Введите конец отрезка b:"  + '\t');
//        byte b = in.nextByte();
//        int res1 = a > b ? b : a;
//        int res2 = b > a ? b : a;
//        System.out.println("Случайное целое число из отрезка " + '\u005b' +  res1 + ';' + res2 + '\u005d' + ": "
//                + ((int)(Math.random()*(b - a + 1)) +a)); // [a;b]
//    }
//}

/**
 * 4.1 Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным
 * либо нечётным.
 */

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите целое число: ");
//        if (in.hasNextByte()){
//            byte number = in.nextByte();
//            if (number % 2 == 0)
//                System.out.println("Введеное число четное"); // Even
//            else System.out.println("Введеное число нечетное"); //Odd
//        } else System.out.println("Вы ввели не целое число");
//    }
//}

/**
 *4.2 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float number1 = in.nextFloat();
        System.out.println("Enter the second number: ");
        float number2 = in.nextFloat();
        if (Math.abs(number1 - 10) > Math.abs(number2 - 10))
            System.out.println("Closer to 10 the second number");
        else if (Math.abs(number1 - 10) < Math.abs(number2 - 10))
            System.out.println("Closer to 10 the first number");
        else if (Math.abs(number1 - 10) == Math.abs(number2 - 10))
            System.out.println("Both numbers at the same distance");
    }
}


