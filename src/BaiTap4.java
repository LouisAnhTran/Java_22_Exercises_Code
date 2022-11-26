/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Compute sum of all digits of one integer
 */

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mot so n: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Tong cac chu so cua " + n + ": " + tongCacChuSoCuaMotSo(n));
	}

	private static int tongCacChuSoCuaMotSo(int n) {
		int tong = 0;
		String chuoiN = String.valueOf(n);
		for (int i = 0; i < chuoiN.length(); i++) {
			tong += Integer.parseInt(String.valueOf(chuoiN.charAt(i)));
		}
		return tong;
	}

}
