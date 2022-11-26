/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Compute sum of all digits of one integer
 */

import java.util.Scanner;

public class BaiTap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=nhapN(sc);
		inRaUocCuaMotSoTuNhien(n);
	}

	private static void inRaUocCuaMotSoTuNhien(int n) {
		System.out.print("Tat ca uoc cua " + n + " la: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}

	private static int nhapN(Scanner sc) {
		System.out.print("Nhap vao mot so n: ");
		int n = Integer.parseInt(sc.nextLine());
		while (n < 0) {
			System.out.print("Nhap n vui long lon hon 0: ");
			n = Integer.parseInt(sc.nextLine());
		}
		return n;
	}

}
