import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hai cạnh
        System.out.print("Nhập cạnh thứ nhất: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh thứ hai: ");
        double b = sc.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (a + b);
        double dienTich = a * b;

        // Tìm cạnh nhỏ
        double canhNho = Math.min(a, b);

        // Xuất kết quả
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho);

        sc.close();
    }
}
