package Baitap4;
import java.util.Scanner;

public class baitap4 {
	public static void main(String[] args) {
		Scanner bt = new Scanner(System.in);
		System.out.println("Hay nhap mot so n bat ki : ");
		int n = bt.nextInt();
		int s = 0;
		for(int i = 0; i<=n; i++) {
			s+=i;
		}
		System.out.println("Tong tu 1 den n la : " +s);
	}
}
