import java.util.Scanner;

public class BaiTap20 {
	final static int canTren = 100;
	final static int canDuoi = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mang = taoMangBatKy(sc);
		xuLy(mang);
	}

	private static int[] taoMangBatKy(Scanner sc) {
		System.out.print("Nhap vao chieu dai cua mang: ");
		int n = Integer.parseInt(sc.nextLine());

		int[] mang = new int[n];

		for (int i = 0; i < mang.length; i++) {
			mang[i] = (int) (Math.random() * (canTren - canDuoi + 1) + canDuoi);
		}

		System.out.print("Mang duoc tao bat ky la: ");
		inMang(mang);

		return mang;
	}

	private static int demSoPhanTuChanLe(int[] mang, int so) {
		int demSo = 0;

		if (so == 1) {
			for (int i : mang) {
				if (i % 2 != 0) {
					demSo += 1;
				}
			}
		} else {
			for (int i : mang) {
				if (i % 2 == 0) {
					demSo += 1;
				}
			}
		}

		return demSo;
	}

	private static void xuLy(int[] mang) {
		int[] mangChan = new int[demSoPhanTuChanLe(mang, 2)];
		int[] mangLe = new int[demSoPhanTuChanLe(mang, 1)];

		int i = 0;
		int j = 0;

		for (int item : mang) {
			if (item % 2 == 0) {
				mangChan[i] = item;
				i++;
			} else {
				mangLe[j] = item;
				j++;
			}
		}

		System.out.print("Mang chan: ");
		inMang(mangChan);
		System.out.print("Mang le: ");
		inMang(mangLe);

	}

	private static void inMang(int[] mang) {
		for (int item : mang) {
			System.out.print(item + ", ");
		}
		System.out.println();
	}

}
