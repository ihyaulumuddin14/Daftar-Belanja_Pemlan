import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) { 
            System.out.println("Selamat Datang di Aplikasi Belanja Online\n");
            System.out.println("Menu:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tampilkan Semua Item");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = in.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Item: ");
                String nama = in.next();
                System.out.print("Masukkan Jumlah Item: ");
                int jumlah = in.nextInt();
                Item item = new Item(nama, jumlah);
                daftarBelanja.tambahItem(item);
            } else if (pilihan == 2) {
                daftarBelanja.tampilSemuaItem();    
            } else if (pilihan == 3) {
                break;
            }
        }
    }
}
