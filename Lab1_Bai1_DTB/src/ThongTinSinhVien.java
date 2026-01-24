import java.util.Scanner;

public class ThongTinSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();

        // Xuất thông tin
        System.out.println("\n--- THÔNG TIN SINH VIÊN ---");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        sc.close();
    }
}
