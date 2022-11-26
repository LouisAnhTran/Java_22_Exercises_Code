import java.util.Scanner;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.HashMap;

public class BaiTap14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = nhapChieuDaiCuaMang(sc);
		int[] mang = new int[n];
		nhapVaoCacPhanTuChoMang(mang, sc);
		xuatMang(mang);
		xoaCacPhanTuBiLapLai(mang);

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

	private static void nhapVaoCacPhanTuChoMang(int[] mang, Scanner sc) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print("mang[" + i + "]: ");
			mang[i] = Integer.parseInt(sc.nextLine());
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

	private static void xoaCacPhanTuBiLapLai(int[] mang) {
		ArrayList<Integer> mangMoi = new ArrayList<>();
		HashMap<Integer, Integer> dict = new HashMap<>();

		for (int i = 0; i < mang.length; i++) {
			if (dict.get(mang[i]) == null) {
				dict.put(mang[i], 1);
			} else {
				dict.put(mang[i], dict.get(mang[i]) + 1);
			}
		}

		for (Integer key : dict.keySet()) {
			if (dict.get(key) == 1) {
				mangMoi.add(key);
			}
		}

		System.out.print("Mang sau khi da tru cac phan tu trung lap la: ");
		for (int i = 0; i < mangMoi.size(); i++) {
			System.out.print(mangMoi.get(i) + ", ");
		}
	}
}
