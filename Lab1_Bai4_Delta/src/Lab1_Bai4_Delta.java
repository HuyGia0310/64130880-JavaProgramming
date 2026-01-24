import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Xuất kết quả
        System.out.println("Delta = " + delta);

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn bậc hai thực");
        }

        sc.close();
    }
}
