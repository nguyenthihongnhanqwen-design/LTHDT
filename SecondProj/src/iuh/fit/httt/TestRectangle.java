package iuh.fit.httt;

import java.util.Scanner;

public class TestRectangle {
	public static void	main(String args[]) {
		Scanner hcn = new Scanner(System.in);
		System.out.println("Chieu dai hcn la : ");
		double d = hcn.nextDouble();
		System.out.println("Chieu rong hinh chu nhat la : ");
		double r = hcn.nextDouble();
		Rectangle bt = new Rectangle(d, r);
		double s = bt.getArea(d, r);
		double c = bt.getPerimeten(d, r);
		System.out.println("dien tich hinh chu nhat la : " +s);
		System.out.println("Chu vi hinh chu nhat la : "+c);
		
	}
}
