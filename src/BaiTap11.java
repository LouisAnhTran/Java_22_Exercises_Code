import java.util.Scanner;

public class BaiTap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap mot so tu nhien n: ");
		int n = Integer.parseInt(sc.nextLine());

		System.out.println("So tu nhien lon nhat thoa yeu cau de bai: "
				+ inRaSoTuNhienLonNhatNhoHonMotSO(Math.log(n) / Math.log(2)));
	}

	private static int inRaSoTuNhienLonNhatNhoHonMotSO(double d1) {
		int n = 0;
		while (n < d1) {
			n++;
		}
		return n - 1;
	}

}
