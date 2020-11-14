/**
 * Latihan50
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Energi Kinetik
 */

public class PBO10k10119176Latihan50 {
        
    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(0.145, 25);
        
        double kinetik = energiKinetik.hitungEnergiKinetik(energiKinetik.getMassa(), energiKinetik.getKecepatan());
        
        System.out.println("========= Energi Kinetik =========");
        System.out.println("Diketahui :");
        System.out.println("Massa \t\t\t = " + energiKinetik.getMassa() + " kg");
        System.out.println("Kecepatan \t\t = " + energiKinetik.getKecepatan() + " m/s");
        System.out.println("Maka :");
        System.out.printf("Energi Kinetik \t\t = %.4f J%n", kinetik);
        System.out.printf("Usaha Saat Diam \t = %.4f J%n", energiKinetik.usahaKetikaDiam(kinetik));
        System.out.println("");
        System.out.printf("Jadi energi kinetik dan usahanya bernilai sama yaitu sebesar %.4f J%n", kinetik );
    }
    


}
