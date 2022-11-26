/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Print US flag
 */
import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				lineMot();
			} else {
				lineHai();
			}
		}

		for (int i = 0; i < 6; i++) {
			lineBa();
		}
	}

	private static void lineBa() {
		System.out.println("==============================================");
	}

	private static void lineMot() {
		System.out.println("* * * * * * ==================================");
	}

	private static void lineHai() {
		System.out.println(" * * * * *  ==================================");
	}

}
