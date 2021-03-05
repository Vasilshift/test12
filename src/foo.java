// Дано натуральное число n. Вычислить: n!

public class foo {

    public static void main(String args[]) {

        int n = 5;
        int x = n + 1;
        int y = 1;
        for (int i = 1; i < n; i++) {
            y = y * (x - i);
        }

        System.out.print("n! = " + y);

    }
}
