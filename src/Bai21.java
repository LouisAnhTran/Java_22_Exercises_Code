import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        run(sc);
    }

    private static void run(Scanner sc) {
        System.out.println("Nhao thong tin cho con Kangooroo thu nhat: ");
        System.out.print("x1: ");
        int x1 = Integer.parseInt(sc.nextLine());

        System.out.print("v1: ");
        int v1 = Integer.parseInt(sc.nextLine());

        System.out.println("-------------------");

        System.out.println("Nhao thong tin cho con Kangooroo thu hai: ");
        System.out.print("x1: ");
        int x2 = Integer.parseInt(sc.nextLine());

        System.out.print("v1: ");
        int v2 = Integer.parseInt(sc.nextLine());

        if (x1 == x2) {
            System.out.println("Hai con Kangaroo da gap nhau tu vi tri xuat phat");
        } else if (v1 == v2) {
            System.out.println("Hai con Kangaroo se khong bao gio gap nhau");
        } else if ((x1 - x2) % (v1 - v2) == 0) {
            System.out.println("Hai con Kangaroo gap nhau sau: " + Math.abs((x1 - x2) / (v1 - v2)));
        }
    }


}
