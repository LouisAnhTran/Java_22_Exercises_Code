import java.util.Scanner;

public class BaiTap18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float soTienGui = soTienGui(sc);
		float soTienMuonNhanTrongTuongLai = soTienMuonNhanTrongTuongLai(sc);
		float laiSuatTienGui = laiSuatTienGui(sc);
		double soNamItNhat = xuLy(soTienGui, soTienMuonNhanTrongTuongLai, laiSuatTienGui);
		System.out.println("So nam it nhat de co du " + soTienMuonNhanTrongTuongLai + " la : " + soNamItNhat + " nam");

	}

	private static float soTienGui(Scanner sc) {
		System.out.print("Nhap vao so tien gui: ");
		float soTienGui = Float.parseFloat(sc.nextLine());
		return soTienGui;
	}

	private static float soTienMuonNhanTrongTuongLai(Scanner sc) {
		System.out.print("Nhap vao so tien muon nhan trong tuong lai: ");
		float soTienMuonNhan = Float.parseFloat(sc.nextLine());
		return soTienMuonNhan;
	}

	private static float laiSuatTienGui(Scanner sc) {
		System.out.print("Nhap vao lai suat tien gui (% - vd: 10%): ");
		float laiSuatTienGui = Float.parseFloat(sc.nextLine());
		return laiSuatTienGui;
	}

	private static double xuLy(float soTienGui, float soTienMuonNhanTrongTuongLai, float laiSuatTienGui) {
		return Math.log(soTienMuonNhanTrongTuongLai / soTienGui) / Math.log(1 + laiSuatTienGui / 100);

	}

}
