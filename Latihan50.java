/**
 * Latihan50
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Energi Kinetik
 */

class EnergiKinetik {
    private double massa, kecepatan;
    
    public EnergiKinetik(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return (massa * kecepatan * kecepatan) / 2;
    }
    
    public double usahaKetikaDiam(double energiKinetik) {
        return energiKinetik;
    }
}
