/*
 * Date: 6/11/23
 * Creator:Nam Anh
 * Function: Compute sum of all digits of one integer
 */

import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nhap vao toa do A: ");
		System.out.print("Nhap x1: ");
		float x1=Float.parseFloat(sc.nextLine());
		System.out.print("Nhap y1: ");
		float y1=Float.parseFloat(sc.nextLine());
		
		System.out.println("Nhap vao toa do B: ");
		System.out.print("Nhap x2: ");
		float x2=Float.parseFloat(sc.nextLine());
		System.out.print("Nhap y2: ");
		float y2=Float.parseFloat(sc.nextLine());
		
		System.out.println("Khoang cach giua hai diem A va B la: "+tinhKhoangCachGiuaHaiDiem(x1,y1,x2,y2));
	}
	
	private static double tinhKhoangCachGiuaHaiDiem(float x1,float y1,float x2,float y2) {
		return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
	}

}
