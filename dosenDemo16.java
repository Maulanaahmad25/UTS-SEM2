public class dosenDemo16 {
    dosen16 [] daftarDosen;
    int jumlahDosen;
    
    public dosenDemo16(int jumlahDosen) {
        daftarDosen = new dosen16[jumlahDosen];
        jumlahDosen = 0;
    }
    public void tambahDosen(dosen16 d) {
        if (jumlahDosen < daftarDosen.length) {
            daftarDosen[jumlahDosen++] = d;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }
    void tampilkanSemuaDosen() {
        for (int i = 0; i < jumlahDosen; i++) {
            daftarDosen[i].tampilkanData();
        }
    }
    void urutkanNIDN() {
        //ASC dengan Bubble Sort sesuai nidn
        for (int i = 0; i < jumlahDosen - 1; i++) {
            for (int j = 0; j < jumlahDosen - i - 1; j++) {
                if (daftarDosen[j].nidn.compareTo(daftarDosen[j + 1].nidn) > 0) {
                    dosen16 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
    }
    void cariDosen(String nama) {
        //linear search
        boolean ditemukan = false;
        for (int i = 0; i < jumlahDosen; i++) {
            if (daftarDosen[i].nama.equalsIgnoreCase(nama)) {
                daftarDosen[i].tampilkanData();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }
    void urutkanMasaKerja() {
       //bubble sort desc sesuai Masa Kerja
    for (int i = 0; i < jumlahDosen - 1; i++) {
        for (int j = 0; j < jumlahDosen - i - 1; j++) {
            if (daftarDosen[j].masaKerja < daftarDosen[j + 1].masaKerja) {
                dosen16 temp = daftarDosen[j];
                daftarDosen[j] = daftarDosen[j + 1];
                daftarDosen[j + 1] = temp;
                }
            }
        }
    }
}