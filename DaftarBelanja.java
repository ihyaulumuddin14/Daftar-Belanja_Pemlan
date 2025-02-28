import java.util.ArrayList;
import java.util.List;

public class DaftarBelanja {
    
    List<Item> daftarItem;
    
    public DaftarBelanja() {
        daftarItem = new ArrayList<>();
    }

    public void tambahItem(Item item) {
        daftarItem.add(item);
        System.out.println(item.getNama() + " berhasil ditambahkan ke daftar belanja.");
    }

    public int hitungTotalItem() {
        int total = 0;
        for (Item item : daftarItem) {
            total += item.getJumlah();
        }
        return total;
    }

    public void tampilSemuaItem() {
        System.out.println("\n\nDaftar Belanja:");
        System.out.println("------------------");
        System.out.println("Nama Item\tJumlah");
        System.out.println("------------------");
        for (Item item : daftarItem) {
            item.tampilItem();
        }
        System.out.println("------------------");
        System.out.println("Total Item:\t" + hitungTotalItem());
        System.out.println("------------------");
    }
}
