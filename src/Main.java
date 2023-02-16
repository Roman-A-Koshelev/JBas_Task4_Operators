import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Необходимо ввести три числа.");
        System.out.print("Введите первое число:  ");
        int x = in.nextInt();
        System.out.print("Введите второе число:  ");
        int y = in.nextInt();
        System.out.print("Введите третье число:  ");
        int z = in.nextInt();

        int avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое = " + avg);

        int avg_div_2 = avg / 2;

        if (avg_div_2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
