package Posttest3;

public class Minuman extends Pemesanan {
    private String kondisi;//panas atau dingin
    private String size;// ukuran gelas 


    public Minuman(String nama,String pesanan, int jumlah, String kondisi, String size){
        super(nama, pesanan, jumlah);
        this.kondisi = kondisi;
        this.size = size;
    }

    public void registrasiminuman(){
        System.out.println("kondisi minuman: " + this.kondisi);
        System.out.println("ukuran gelas: " + this.size);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }
    
    public void terupdateminuman(){
        System.out.println("kondisi minuman:" + this.kondisi);
        System.out.println("ukuran gelas: " + this.size);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }

    public void terhapusminuman(){
        System.out.println("kondisi minuman: " + this.kondisi);
        System.out.println("ukuran gelas: " + this.size);
        System.out.println("Pesanan Telah Dihapus");
        System.out.println("=============================");
    }


    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
