public class dosen16 {
    String nidn;
    String nama;
    String email;
    int tahunMasuk;
    String prodi;
    int masaKerja;

    public dosen16(String nidn, String nama, String email, int tahunMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
        int tahunSekarang = java.time.Year.now().getValue();
        this.masaKerja = tahunSekarang - tahunMasuk; 
    }
    void tampilkanData() {
        System.out.println();
        System.out.println("NIDN    : " + nidn);
        System.out.println("Nama    : " + nama);
        System.out.println("Email   : " + email);
        System.out.println("Prodi   : " + prodi);;
        System.out.println("Masa Kerja  : " + masaKerja + " Tahun");
        System.out.println("--------------------------------");
    }
}