import java.util.Scanner;

public class BaiTapNop16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = nhapVaoNam(sc);

		if (kiemTraMotNamCoPhaiNhuanHayKhong(n)) {
			System.out.println(n + " la nam Nhuan");
		} else {
			System.out.println(n + " khong phai la nam nhuan");
		}

	}

	private static int nhapVaoNam(Scanner sc) {
		System.out.print("Nhap vao nam muon kiem nam nhuan hay khong: ");
		int nam = Integer.parseInt(sc.nextLine());
		return nam;
	}

	private static boolean kiemTraMotNamCoPhaiNhuanHayKhong(int n) {
		if (n < 100) {
			if (n % 4 == 0) {
				return true;
			}
		}

		if (String.valueOf(n).substring(String.valueOf(n).length() - 2).equals("00")) {
			if (n % 400 == 0) {
				return true;
			}
			return false;
		}

		if (n % 4 == 0) {
			return true;
		}

		return false;

	}

}
