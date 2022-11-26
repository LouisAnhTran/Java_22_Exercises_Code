import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi de check: ");
        String chuoi = sc.nextLine();
        int index = checkPalindrome(chuoi, 0, chuoi.length() - 1);
        if (index == -1) {
            System.out.println(chuoi + "khong chua bat ky chuoi Palindrome");
        } else {
            System.out.println("Chuoi lap lai dai nhat la: " + chuoi.substring(0, index + 1));
        }
    }

    private static int checkPalindrome(String chuoi, int start, int end) {
        if (start >= end) {
            return start;
        }
        if (!String.valueOf(chuoi.charAt(start)).equals(String.valueOf(chuoi.charAt(end)))) {
            return start - 1;
        } else {
            return checkPalindrome(chuoi, start + 1, end - 1);
        }
    }
}


