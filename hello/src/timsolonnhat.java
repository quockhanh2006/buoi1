public class timsolonnhat {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 18;

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Số lớn nhất là: " + max);
    }
}
