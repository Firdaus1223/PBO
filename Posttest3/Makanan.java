package Posttest3;

public class Makanan extends Pemesanan {
    private String tipe;//makanan berat atau ringan
    private String deskripsi;//deskripsi soal isi makanan

    public Makanan(String nama,String pesanan, int jumlah, String tipe, String deskripsi){
        super(nama, pesanan, jumlah);
        this.tipe = tipe;
        this.deskripsi = deskripsi;
    }

    public void registrasimakanan(){
        System.out.println("tipe pesanan: " + this.tipe);
        System.out.println("deskripsi Pesanan: " + this.deskripsi);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }
    
    public void terupdatemakanan(){
        System.out.println("tipe pesanan:" + this.tipe);
        System.out.println("deskripsi pesanan: " + this.deskripsi);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }

    public void terhapusmakanan(){
        System.out.println("tipe pesanan: " + this.tipe);
        System.out.println("deskripsi pesanan: " + this.deskripsi);
        System.out.println("Pesanan Telah Dihapus");
        System.out.println("=============================");
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
 

}
