/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Compute sum of all digits of one integer
 */

import java.util.Scanner;

public class BaiTap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Hay nhap vao mot chuoi bat ky: ");
		String chuoi = sc.nextLine();
		System.out.println("Chuoi duoc dao nguoi la: " + daoNguocChuoi(chuoi));

	}

	private static String daoNguocChuoi(String chuoi) {
		String chuoiMoi = "";
		for (int i = chuoi.length() - 1; i > -1; i--) {
			chuoiMoi = chuoiMoi.concat(String.valueOf(chuoi.charAt(i)));
		}
		return chuoiMoi;
	}

}
