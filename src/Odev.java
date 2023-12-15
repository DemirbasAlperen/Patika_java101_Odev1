import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + turkce + tarih + kimya + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Not Ortalamanız : " + sonuc);

        System.out.print(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
