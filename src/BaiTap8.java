
/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Compute sum of all digits of one integer
 */
import java.util.Scanner;

public class BaiTap8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao mot chuoi de xu ly: ");
		String chuoi = sc.nextLine();
		String[] chuoiArray = chuyenThanhArrayStringCoKiTuDauVietHoa(chuoi);
		System.out.println("Chuoi theo yeu cau de bai: " + taoRaChuoiMoiThoaManYeuCauDeBai(chuoiArray));
	}

	private static String chuyenMotChuoiThuongThanhChuoiCoKiTuDauTienVietHoa(String chuoi) {
		String kiTuDau = chuoi.substring(0, 1).toUpperCase();
		String chuoiMoi = kiTuDau.concat(chuoi.substring(1));
		return chuoiMoi;
	}

	private static String[] chuyenThanhArrayStringCoKiTuDauVietHoa(String chuoi) {
		String[] chuoiArray = chuoi.split(" ");
		for (int i = 0; i < chuoiArray.length; i++) {
			chuoiArray[i] = chuyenMotChuoiThuongThanhChuoiCoKiTuDauTienVietHoa(chuoiArray[i]);
		}
		return chuoiArray;
	}

	private static String taoRaChuoiMoiThoaManYeuCauDeBai(String[] chuoiArray) {
		return String.join(" ", chuoiArray);
	}

}
