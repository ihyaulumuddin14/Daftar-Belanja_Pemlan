import java.util.ArrayList;
import java.util.List;

public class DaftarBelanja {
    
    List<Item> DaftarBelanja;
    
    public DaftarBelanja() {
        DaftarBelanja = new ArrayList<>();
    }

    public void tambahItem(Item item) {
        DaftarBelanja.add(item);
        System.out.println(item.getNama() + " berhasil ditambahkan ke daftar belanja.");
    }

    public void hapusItem(int no_item) {
        if (no_item > 0 && no_item <= DaftarBelanja.size()) {
            Item item = DaftarBelanja.get(no_item - 1);
            DaftarBelanja.remove(item);
            System.out.println(item.getNama() + " berhasil dihapus dari daftar belanja.");
        } else {
            System.out.println("Item dengan nomor " + no_item + " tidak ditemukan dalam daftar belanja.");
        }
    }

    public int hitungTotalItem() {
        int total = 0;
        for (Item item : DaftarBelanja) {
            total += item.getJumlah();
        }
        return total;
    }

    public void tampilSemuaItem() {
        System.out.println("\n\nDaftar Belanja:");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-10s %-20s %-20s\n", "No", "Nama Item", "Jumlah", "Harga Satuan", "Total Harga");
        System.out.println("---------------------------------------------------------------------------");
        if (DaftarBelanja.isEmpty()) {
            System.out.println("Daftar belanja masih kosong.");
        } else {
            for (int i = 0; i < DaftarBelanja.size(); i++) {
                Item item = DaftarBelanja.get(i);
    
                int no = i + 1;
                String nama = item.getNama();
                int jumlah = item.getJumlah();
                double harga = item.getHarga();
                double totalHarga = jumlah * harga;
    
                System.out.printf("%-10d %-20s %-10d %-20.2f %-20.2f\n", no, nama, jumlah, harga, totalHarga);
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Total Item:\t" + hitungTotalItem());
        System.out.println("---------------------------------------------------------------------------");
    }
}
