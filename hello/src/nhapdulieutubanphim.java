import java.util.Scanner;
public class nhapdulieutubanphim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("Xin chào " + name);
        System.out.println("Tuổi của bạn là " + age);

        sc.close();
    }

}


