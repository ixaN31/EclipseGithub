package deneme;

import java.util.Scanner;

public class KdvHesaplama {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double kdvsiz, kdvli, kdv;
		System.out.print("Fiyatı Giriniz : ");
		kdvsiz = inp.nextDouble();
		kdv = (kdvsiz / 100) * 18;
		kdvli = kdvsiz + kdv;
		System.out.println("kdvsiz fiyatı : " + kdvsiz);
		System.out.println("kdvli fiyatı : " + kdvli);
		System.out.println("kdv miktarı : " + kdv);
		
	}
}
