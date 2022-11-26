import java.util.Scanner;

public class BaiTap13 {
	static final int canTren = 100;
	static final int canDuoi = -100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = nhapChieuDaiCuaMang(sc);
		int[] mang = new int[n];
		nhapVaoCacPhanTuChoMang(mang);
		xuatMang(mang);

		int luaChon;
		do {
			System.out.println();
			inMenu();
			System.out.print("Moi ban chon tu 1-8: ");
			luaChon = Integer.parseInt(sc.nextLine());
			while (luaChon < 1 || luaChon > 8) {
				System.out.print("Xin moi nhap lai: ");
				luaChon = Integer.parseInt(sc.nextLine());
			}
			System.out.println();

			switch (luaChon) {
			case 1:
				cau1TinhGiaTriTrungBinh(mang);
				break;
			case 2:
				cau2TimPhanTuLonNhatNhoNhat(mang);
				break;
			case 3:
				cau3TimPhanTuLonNhatNhoNhatTrongMang(mang);
				break;
			case 4:
				timPhanTuDuongLonNhatNhoNhatTrongMang(mang);
				break;
			case 5:
				inPhanTuChanLe(mang);
				break;
			case 6:
				themMotPhanTuTheoIndex(mang, sc);
				break;
			case 7:
				xoaMotPhanTuTheoIndex(mang, sc);
				break;
			case 8:
				break;
			}

		} while (luaChon != 8);

	}

	private static void inMenu() {
		System.out.println("========= MENU ===========");
		System.out.println("1. Tinh gia tri trung binh");
		System.out.println("2. Tim phan tu lon nhat, nho nhat");
		System.out.println("3. Tim phan tu am lon nhat, nho nhat trong mang");
		System.out.println("4. Tim phan tu duong lon nhat, nho nhat trong mang");
		System.out.println("5. In ra cac phan tu chan le");
		System.out.println("6. Them mot phan tu theo index");
		System.out.println("7. Xoa mot phan tu theo index");
		System.out.println("8. Thoat chuong trinh");
	}

	private static int nhapChieuDaiCuaMang(Scanner sc) {
		System.out.print("Nhap vao chieu dai cua mang: ");
		int n = Integer.parseInt(sc.nextLine());
		while (n <= 0) {
			System.out.print("Nhap lai chieu dai mang >0: ");
			n = Integer.parseInt(sc.nextLine());
		}
		System.out.println();
		return n;
	}

	private static void nhapVaoCacPhanTuChoMang(int[] mang) {
		for (int i = 0; i < mang.length; i++) {
			mang[i] = (int) (Math.random() * (canTren - canDuoi + 1) + canDuoi);
		}
		System.out.println();

	}

	private static void xuatMang(int[] mang) {
		System.out.print("Cac phan tu cua mang la: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + ", ");
		}
		System.out.println("\n");

	}

	// Cau 1
	private static void cau1TinhGiaTriTrungBinh(int[] mang) {
		int tong = 0;
		for (int so : mang) {
			tong += so;
		}
		System.out.println("Trung binh cua cac phan tu trong mang la: " + (tong / mang.length));
	}

	// Cau 2
	private static void cau2TimPhanTuLonNhatNhoNhat(int[] mang) {
		int nhoNhat = mang[0];
		int lonNhat = mang[0];
		for (int so : mang) {
			if (so < nhoNhat) {
				nhoNhat = so;
			}
			if (so > lonNhat) {
				lonNhat = so;
			}
		}
		System.out.println("So lon nhat cua mang la: " + lonNhat);
		System.out.println("So nho nhat cua mang la: " + nhoNhat);
	}

	// Cau 3
	private static void cau3TimPhanTuLonNhatNhoNhatTrongMang(int[] mang) {
		int nhoNhat = 1000;
		int lonNhat = -1000;

		for (int so : mang) {
			if (so < 0 && so < nhoNhat) {
				nhoNhat = so;
			}

			if (so < 0 && so > lonNhat) {
				lonNhat = so;
			}
		}

		if (nhoNhat == 1000) {
			System.out.println("Mang khong co so am");
		} else {
			System.out.println("So am lon nhat la: " + lonNhat);
			System.out.println("So am nho nhat la: " + nhoNhat);
		}
	}

	// Cau 4
	private static void timPhanTuDuongLonNhatNhoNhatTrongMang(int[] mang) {
		int lonNhat = 0;
		int nhoNhat = 1000;

		for (int i = 0; i < mang.length; i++) {
			if (mang[i] > 0 && mang[i] > lonNhat) {
				lonNhat = mang[i];
			}

			if (mang[i] > 0 && mang[i] < nhoNhat) {
				nhoNhat = mang[i];
			}
		}

		if (lonNhat == 0) {
			System.out.println("Mang khong co so duong");
		}

		System.out.println("So duong lon nhat trong mang la: " + lonNhat);
		System.out.println("So duong nho nhat trong mang la: " + nhoNhat);
		System.out.println();
	}

	// Cau 5
	private static void inPhanTuChanLe(int[] mang) {
		System.out.print("Cac phan tu chan: ");
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] % 2 == 0) {
				System.out.print(mang[i] + ", ");
			}
		}
		System.out.println();

		System.out.print("Cac phan tu le: ");
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] % 2 != 0) {
				System.out.print(mang[i] + ", ");
			}
		}
		System.out.println();
	}

	// Cau 6
	private static void themMotPhanTuTheoIndex(int[] mang, Scanner sc) {
		System.out.print("Nhap vao index can nhap: ");
		int index = Integer.parseInt(sc.nextLine());

		if (index < 0 || index > mang.length) {
			return;
		}

		int[] mangMoi = new int[mang.length + 1];

		System.out.print("Nhap vao phan tu ma ban muon them: ");
		int phanTu = Integer.parseInt(sc.nextLine());

		if (index == 0) {
			mangMoi[0] = phanTu;
			for (int i = 0; i < mang.length; i++) {
				mangMoi[i + 1] = mang[i];
			}
		} else if (index == mang.length) {
			mangMoi[index] = phanTu;
			for (int i = 0; i < mang.length; i++) {
				mangMoi[i] = mang[i];
			}
		} else {
			for (int i = 0; i < index; i++) {
				mangMoi[i] = mang[i];
			}
			mangMoi[index] = phanTu;
			for (int i = index; i < mang.length; i++) {
				mangMoi[i + 1] = mang[i];
			}
		}

		xuatMang(mangMoi);
	}

	// Cau 7: Xoa mot phan tu theo index
	private static void xoaMotPhanTuTheoIndex(int[] mang, Scanner sc) {
		System.out.print("Nhap vao mot phan tu theo index: ");
		int index = Integer.parseInt(sc.nextLine());

		if (index < 0 || index >= mang.length) {
			System.out.println("Index ban nhap vao khong hop le");
			return;
		}

		int[] mangMoi = new int[mang.length - 1];

		if (index == 0) {
			for (int i = 1; i < mang.length; i++) {
				mangMoi[i - 1] = mang[i];
			}
		} else if (index == mang.length - 1) {
			for (int i = 0; i < mang.length - 1; i++) {
				mangMoi[i] = mang[i];
			}
		} else {
			for (int i = 0; i < index; i++) {
				mangMoi[i] = mang[i];
			}
			for (int i = index + 1; i < mang.length; i++) {
				mangMoi[i - 1] = mang[i];
			}
		}

		xuatMang(mangMoi);
	}

}
