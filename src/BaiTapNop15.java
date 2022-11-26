import java.util.Scanner;

public class BaiTapNop15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String chuoi = nhapVaoChuoi(sc);
		inRaChuoiDaiCuaChuoi(chuoi);
		System.out.println();
		System.out.print("Nhap vao chuoi phu: ");
		String chuoiPhu = sc.nextLine();
		if (kiemTraChuoiCoChuaChuoiPhuHayKhong(chuoi, chuoiPhu)) {
			System.out.println(chuoi + " co chua " + chuoiPhu);
		} else {
			System.out.println(chuoi + " khongo co chua " + chuoiPhu);
		}
	}

	private static String nhapVaoChuoi(Scanner sc) {
		System.out.print("Nhap vao mot chuoi: ");
		String chuoi = sc.nextLine();
		return chuoi;
	}

	private static void inRaChuoiDaiCuaChuoi(String chuoi) {
		System.out.print("Chieu dai cua chuoi la: " + chuoi.length());
	}

	private static boolean kiemTraChuoiCoChuaChuoiPhuHayKhong(String chuoi, String chuoiPhu) {
		return chuoi.contains(chuoiPhu);
	}

}
