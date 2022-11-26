import java.util.Scanner;

public class BaiTap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao mot so n: ");
		int n = Integer.parseInt(sc.nextLine());

		System.out.println("Tong cua cac so nguyen to tu 1 den " + n + " la: " + tinhTongCacSoNguyenTo(n));
	}

	private static boolean kiemTraMotSoCoPhaiSoNguyenToHayKhong(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		if (n == 2) {
			return true;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static int tinhTongCacSoNguyenTo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (kiemTraMotSoCoPhaiSoNguyenToHayKhong(i)) {
				sum += i;
			}
		}
		return sum;
	}

}
