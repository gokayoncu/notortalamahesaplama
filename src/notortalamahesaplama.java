import java.util.Scanner;
public class aa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,beden,fizik,tarih,muzik,fen;

        System.out.print("Matematik notunuz :");
        mat =input.nextInt();

        System.out.print("Beden notunuz :");
        beden =input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik =input.nextInt();

        System.out.print("Tarih notunuz :");
        tarih =input.nextInt();

        System.out.print("Muzik notunuz :");
        muzik =input.nextInt();
        System.out.print("Fen notunuz :");
        fen =input.nextInt();

        int toplam = mat+beden+fizik+tarih+muzik+fen;
        double ortalama =toplam/6.0;

        System.out.println("Not ortalamaniz :"+ortalama);

        boolean durum = ortalama>=50;
        String sonuc = durum ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(sonuc);
    }
}
