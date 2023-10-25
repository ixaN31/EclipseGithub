package deneme;

import java.util.Scanner;

public class ifelseyok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sonuc;
        System.out.print("Sonucunuzu girin: ");
        sonuc = inp.nextInt();

        String info = sonuc >= 60 ? "Geçti" : "Kaldı";
        System.out.println(info);
    }
}