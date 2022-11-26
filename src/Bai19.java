import com.sun.jdi.FloatType;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
    }

    private static void run(Scanner sc) {
        System.out.println("============ Giai phuong trinh bac 1, bac 2 ============");
        int luaChon;
        do {
            showMenu();
            System.out.print("Nhap vap lua chon cua ban: ");
            luaChon = Integer.parseInt(sc.nextLine());
            while (luaChon > 3 || luaChon < 0) {
                System.out.print("Vui long nhap lai 1-3: ");
                luaChon = Integer.parseInt(sc.nextLine());
            }
            switch (luaChon) {
                case 1:
                    giaiPhuongTrinhBacMot(sc);
                    break;
                case 2:
                    giaiPhuongTrinhBacHai(sc);
                    break;
                case 3:
                    break;
            }
        } while (luaChon != 3);
    }

    private static void showMenu() {
        System.out.println("=========== Menu ==========");
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Thoat");
    }

    private static void giaiPhuongTrinhBacMot(Scanner sc) {
        System.out.println("====== Giai phuong trinh bac mot =======");
        System.out.println("Phuong trinh co dang ax+b=0");
        System.out.print("Nhap vap he so a: ");
        float a = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap vao he so b: ");
        float b = Float.parseFloat(sc.nextLine());

        System.out.println("Phuong trinh co dang: " + a + "x + " + b + " = 0");
        if (a == 0 & b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 & b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.println("Phuong trinh co nghiem duy nhat: " + (-b / a));
        }
    }

    private static void giaiPhuongTrinhBacHai(Scanner sc) {
        System.out.println();
        System.out.println("========== Giai phuong trinh bac hai =========");
        System.out.print("Nhap vao he so a: ");
        float a = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap vao he so b: ");
        float b = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap vao he so c: ");
        float c = Float.parseFloat(sc.nextLine());

        System.out.println("Phuong trinh co dang: " + a + "x^2 + " + b + "x " + c + " = 0");

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            float nghiemKep = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: " + nghiemKep);
        } else {
            System.out.println("Phuong trinh co hai nghiem phan biet: ");
            float x1 = (float) ((-b + Math.pow(delta, 1 / 2)) / (2 * a));
            float x2 = (float) ((-b - Math.pow(delta, 1 / 2)) / (2 * a));
            System.out.println("Nghiem x1: " + x1);
            System.out.println("Nghiem x2: " + x2);
        }
        System.out.println();

    }

}
