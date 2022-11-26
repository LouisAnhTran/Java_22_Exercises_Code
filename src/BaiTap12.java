import java.util.Scanner;

public class BaiTap12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("In ra mot so nguyen n: ");
		int n = Integer.parseInt(sc.nextLine());

		inRaTamGiacVuong(n);

	}

	private static void inRaTamGiacVuong(int n) {
		for (int i = 1; i <= n; i++) {
			String chuoi = "";
			for (int j = 1; j <= i; j++) {
				chuoi = chuoi.concat(String.valueOf(j));
			}
			System.out.println(chuoi);
		}
	}

}
