import java.util.Scanner;

public class BaiTinhTienKaraoke {
	private final static float giaBaGioDau = 30000f;
	private final static float donGia = 0.3f;
	private final static float thoiGianMoCua = 9f;
	private final static float thoiGianDongCua = 24f;
	private final static float thoiGianKetThucKhuyenMai = 17f;
	private final static int donGiaMoiChaiNuoc = 10000;
	private final static float khuyenMaiSuDungDichVuTrongNgay = 0.2f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("============= Chuong trinh tinh tien Karaoke ===========");
		System.out.println();
		float[] mang = nhapGioBatDauVaKetThuc(sc);
		int soChaiNuocTieuThu = nhapVaoSoChaiNuocTieuThu(sc);
		tinhTongTienPhaiTra(mang, soChaiNuocTieuThu);
	}

	private static float[] nhapGioBatDauVaKetThuc(Scanner sc) {
		float[] mang = new float[2];

		System.out.println("=========== Nhap vao gio bat va ket thuc =========");
		System.out.print("Vui long nhap gio bat dau: ");
		float gioBatDau = Float.parseFloat(sc.nextLine());

		while (gioBatDau < thoiGianMoCua) {
			System.out.print("Vui long nhap gio bat dau lon hon " + thoiGianMoCua + " : ");
			gioBatDau = Float.parseFloat(sc.nextLine());
		}

		System.out.print("Vui long nhap gio ket thuc: ");
		float gioKetThuc = Float.parseFloat(sc.nextLine());

		while (gioKetThuc < thoiGianMoCua || gioKetThuc < gioBatDau) {
			System.out.print("Vui long nhap gio ket thuc lon hon gio bat dau " + gioBatDau + " va be hon "
					+ thoiGianDongCua + " h: ");
			gioKetThuc = Float.parseFloat(sc.nextLine());
		}

		mang[0] = gioBatDau;
		mang[1] = gioKetThuc;

		System.out.println();

		return mang;
	}

	private static int nhapVaoSoChaiNuocTieuThu(Scanner sc) {
		System.out.print("Nhao vao so chai nuoc can tieu thu: ");
		int soChaiNuoc = Integer.parseInt(sc.nextLine());
		System.out.println();
		return soChaiNuoc;
	}

	private static void tinhTongTienPhaiTra(float[] mang, int soChaiNuoc) {
		float tongTien = 0;
		float tienKaraoke = 0;
		float tienNuoc = 0;

		System.out.println("=========== Tong tien su dung dich vu =========");
		tienNuoc = soChaiNuoc * donGiaMoiChaiNuoc;

		float tongSoGioSuDungDichVu = mang[1] - mang[0];

		if (tongSoGioSuDungDichVu <= 3) {
			tienKaraoke = tongSoGioSuDungDichVu * giaBaGioDau;
		} else {
			tienKaraoke = (tongSoGioSuDungDichVu - 3) * (giaBaGioDau * donGia) + 3 * giaBaGioDau;
		}

		tongTien = tienKaraoke + tienNuoc;

		if (mang[1] <= thoiGianKetThucKhuyenMai) {
			tongTien *= (1 - khuyenMaiSuDungDichVuTrongNgay);
		}

		System.out.println("Tong tien khach hang phai thanh toan la: " + tongTien + " VND");
	}

}
