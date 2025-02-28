
public class Item {
    private String id_item;
    private String nama;
    private int jumlah;
    private double harga;

    public Item(String nama, int jumlah, double harga) {
        this.id_item = generateItemIdStatic();
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public double getHarga() {
        return this.harga;
    }

    public String getId() {
        return this.id_item;
    }

    public void tampilDetailItem() {
        System.out.println("ID\t\t:" + getId() + "\n" + "Nama Item\t:" + getNama() + "\n" +  "Jumlah\t\t:" + getJumlah());
    }

    public static String generateItemIdStatic() {
        int id = (int) Math.floor(Math.random()*100000);
        return String.valueOf(id);
    }
}
