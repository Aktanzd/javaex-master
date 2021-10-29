package math;

public class Calc {
    public static void main() {
        sum(90, 67);
        max(90, 67);
    }
    public static int max(int a, int b) {
        if (a < b) {
            System.out.println("Максимальное число = "+ b);
            return b;
        }
        else {
            System.out.println("Максимальное число = " + a);
            return a;
        }
    }
    public static int sum(int a, int b) {
        System.out.println("Сумма чисел = " + (b+a));
        return a+b;
    }
}
