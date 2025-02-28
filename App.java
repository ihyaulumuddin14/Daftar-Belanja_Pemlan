import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DaftarBelanja daftarBelanja = new DaftarBelanja();
        System.out.println("-----------------------------------------");
        System.out.println("Selamat Datang di Aplikasi Belanja Online");
        System.out.println("-----------------------------------------");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tampilkan Semua Item");
            System.out.println("3. Tampilkan Detail Item");
            System.out.println("4. Hapus Item");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Nama Item: ");
                    String nama = in.next();
                    System.out.print("Masukkan Jumlah Item: ");
                    int jumlah = in.nextInt();
                    System.out.print("Masukkan Harga Item: ");
                    double harga = in.nextDouble();
                    Item item = new Item(nama, jumlah, harga);
                    daftarBelanja.tambahItem(item);
                }
                case 2 -> daftarBelanja.tampilSemuaItem();
                case 3 -> {
                    System.out.print("Masukkan Nomor Item: ");
                    int nomor = in.nextInt();
                    if (nomor < 1 || nomor > daftarBelanja.DaftarBelanja.size()) {
                        System.out.println("Item tidak tersedia.");
                        continue;
                    }
                    Item item = daftarBelanja.DaftarBelanja.get(nomor - 1);
                    item.tampilDetailItem();
                }
                case 4 -> {
                    System.out.print("Masukkan Nomor Item yang ingin dihapus: ");
                    int nomor = in.nextInt();
                    daftarBelanja.hapusItem(nomor);
                }
                case 0 -> {
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
