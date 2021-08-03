import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        double kilo,boy,indeks;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = inp.nextDouble();

        indeks = (kilo / (boy * boy));

        System.out.print("Vücut Kitle İndeksiniz :" + indeks);

    }
}
