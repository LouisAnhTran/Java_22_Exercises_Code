import java.util.Scanner;

public class BaiTap17 {
	private final static int canTren = 1000;
	private final static int canDuoi = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		xuLy(sc);
	}

	public static int nhapVaoMotSo(Scanner sc) {
		System.out.print("Nhap vao mot so trong khoang 1-1000: ");
		int so = Integer.parseInt(sc.nextLine());
		while (so < 1 || so > 1000) {
			System.out.print("Vui long nhap lai so trong khoang 1-1000: ");
			so = Integer.parseInt(sc.nextLine());
		}
		return so;
	}

	private static void xuLy(Scanner sc) {
		int mayChon = (int) (Math.random() * (canTren - canDuoi + 1) + canDuoi);
		int banChon;

		do {
			banChon = nhapVaoMotSo(sc);
			if (banChon > mayChon) {
				System.out.println(banChon + " lon hon so cua may tinh");
			} else if (banChon < mayChon) {
				System.out.println(banChon + " nho hon so cua may tinh");
			} else {
				System.out.println("So ban chon trung khop voi may " + mayChon);
				break;
			}

		} while (banChon != mayChon);
	}

}
