package Posttest6;

public final class Makanan extends Pemesanan {
    private String tipe;//makanan berat atau ringan
    private String deskripsi;//deskripsi soal isi makanan
    private boolean tambahanSusu;

    public Makanan(String nama,String pesanan, int jumlah,String jeniskopi, int jumlahGula, String tipe, String deskripsi){
        super(nama, pesanan, jumlah,jeniskopi, jumlahGula);
        this.tipe = tipe;
        this.deskripsi = deskripsi;
    }

    public void registrasimakanan(){
        registrasi();
        System.out.println("tipe pesanan: " + this.tipe);
        System.out.println("deskripsi Pesanan: " + this.deskripsi);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }
    
    public void terupdatemakanan(){
        terupdate();
        System.out.println("tipe pesanan:" + this.tipe);
        System.out.println("deskripsi pesanan: " + this.deskripsi);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }

    public void terhapusmakanan(){
        terhapus();
        System.out.println("tipe pesanan: " + this.tipe);
        System.out.println("deskripsi pesanan: " + this.deskripsi);
        System.out.println("Pesanan Telah Dihapus");
        System.out.println("=============================");
    }

    public void pesanKopi(String jenisKopi, int jumlahGula, boolean tambahanSusu) {
        if (tambahanSusu = true) {
            System.out.println("Anda memesan kopi " + jenisKopi + " dengan " + jumlahGula + " gula dan susu");
        } else {
            System.out.println("Anda memesan kopi " + jenisKopi + " dengan " + jumlahGula + " gula");
        }
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
 
    @Override
    public void display(){
        System.out.println("Coffee Order:");
        System.out.println("Type: " + tipe);
        System.out.println("Description: " + deskripsi);
        System.out.println("Sugar: " + jumlahGula);
        System.out.println("Milk: " + (tambahanSusu ? "Yes" : "No"));
        }
}
