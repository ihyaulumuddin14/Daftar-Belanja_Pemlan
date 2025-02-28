
public class Item {
    private String id_item;
    private String nama;
    private int jumlah;

    public Item(String nama, int jumlah) {
        this.id_item = generateItemIdStatic();
        this.nama = nama;
        this.jumlah = jumlah;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public String getId() {
        return this.id_item;
    }

    public void tampilItem() {
        System.out.println(getNama() + "\t\t" + getJumlah());
    }

    public void tampilDetailItem() {
        System.out.println("ID\t\t\t:" + getId() + "\n" + "Nama Item\t:" + getNama() + "\n" +  "Jumlah\t\t:" + getJumlah());
    }

    public static String generateItemIdStatic() {
        int id = (int) Math.floor(Math.random()*100000);
        return String.valueOf(id);
    }
}
