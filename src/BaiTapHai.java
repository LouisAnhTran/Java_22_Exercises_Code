/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Convert Binary based numbers to base 10 numbers and vice versa 
 */

import java.util.Scanner;

public class BaiTapHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("In ra mot so nguyue n: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(chuyenDoiThapPhanSangNhiPhan(n));

		System.out.print("In ra mot day so nhi phan: ");
		String chuoi = sc.nextLine();
		System.out.println(chuyenDoiNhiPhanSangThapPhan(chuoi));

	}

	private static String chuyenDoiThapPhanSangNhiPhan(int n) {
		String luuTru = "";

		if (n == 0) {
			return "0";
		}

		while (n > 0) {
			luuTru = luuTru.concat(Integer.toString(n % 2));
			n /= 2;
		}

		String ketQua = "";
		for (int i = luuTru.length() - 1; i > -1; i--) {
			ketQua = ketQua.concat(String.valueOf(luuTru.charAt(i)));
		}

		return ketQua;
	}

	private static int chuyenDoiNhiPhanSangThapPhan(String chuoi) {
		int temp = 0;
		for (int i = 0; i < chuoi.length(); i++) {
			if (i == 0) {
				temp = Integer.parseInt(String.valueOf(chuoi.charAt(i))) + 2 * 0;
			} else {
				temp = 2 * temp + Integer.parseInt(String.valueOf(chuoi.charAt(i)));
			}
		}
		return temp;
	}

}
