import java.util.Scanner;

public class dosenMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dosenDemo16 ds = new dosenDemo16(10);

        //data dosen
        ds.tambahDosen(new dosen16("12345", "Budi", "budi@polinema.ac.id", 2010, "TI"));
        ds.tambahDosen(new dosen16("12346", "Ani", "ani@polinema.ac.id", 2015, "MI"));
        ds.tambahDosen(new dosen16("12347", "Cici", "cici@polinema.ac.id", 2012, "SIB"));

        int pilihan;
        do{
            System.out.println("\n> > > > > > MENU SISTEM INFORMASI DOSEN < < < < <");
            System.out.println("1. Tampilkan data dosen");
            System.out.println("2. Urutkan berdasarkan NIDN (ASC)");
            System.out.println("3. Cari dosen berdasarkan nama");
            System.out.println("4. Urutkan berdasarkan masa kerja (DESC)");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    ds.tampilkanSemuaDosen();
                    break;
                case 2:
                    ds.urutkanNIDN();
                    System.out.println("Data dosen telah diurutkan berdasarkan NIDN (ASC).");
                    ds.tampilkanSemuaDosen();
                    break;
                case 3:
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.next();    
                    ds.cariDosen(nama);
                    break;
                case 4:
                    ds.urutkanMasaKerja();
                    System.out.println("Data dosen telah diurutkan berdasarkan masa kerja (DESC).");
                    ds.tampilkanSemuaDosen();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }while(pilihan != 5);
        sc.close();
        }
    }