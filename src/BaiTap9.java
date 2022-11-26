import java.util.Scanner;

public class BaiTap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so nguyen: ");
		int so1 = Integer.parseInt(sc.nextLine());

		System.out.print("Nhap vao mot so nguyen: ");
		int so2 = Integer.parseInt(sc.nextLine());

		if (kiemTranHaiChuoiCoCungMotKiTuGiongNhau(String.valueOf(so1), String.valueOf(so2))) {
			System.out.println("Hai so co it nhat mot chu giong nhau");
		} else {
			System.out.println("Hai so khong co bat cu chu so nao giong nhau");
		}

	}

	private static boolean kiemTranHaiChuoiCoCungMotKiTuGiongNhau(String chuoi1, String chuoi2) {
		for (int i = 0; i < chuoi1.length(); i++) {
			if (chuoi2.contains(String.valueOf(chuoi1.charAt(i)))) {
				return true;
			}
		}
		return false;
	}

}
