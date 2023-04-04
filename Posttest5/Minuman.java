package Posttest5;

public class Minuman extends Pemesanan {
    private String kondisi;//panas atau dingin
    private String size;// ukuran gelas 
    private boolean tambahanSusu;


    public Minuman(String nama,String pesanan, int jumlah, String jeniskopi, int jumlahGula, String kondisi, String size, boolean tambahanSusu){
        super(nama, pesanan, jumlah, jeniskopi, jumlahGula);
        this.kondisi = kondisi;
        this.size = size;
    }

    public void registrasiminuman(){
        registrasi();
        System.out.println("kondisi minuman: " + this.kondisi);
        System.out.println("ukuran gelas: " + this.size);
        System.out.println("Pesanan Telah Dibuat");
    }
    
    public void terupdateminuman(){
        terupdate();
        System.out.println("kondisi minuman:" + this.kondisi);
        System.out.println("ukuran gelas: " + this.size);
        System.out.println("Pesanan Telah Dibuat");
        System.out.println("=============================");
    }

    public void terhapusminuman(){
        terhapus();
        System.out.println("kondisi minuman: " + this.kondisi);
        System.out.println("ukuran gelas: " + this.size);
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


    public boolean isTambahanSusu() {
        return this.tambahanSusu;
    }

    public boolean getTambahanSusu() {
        return this.tambahanSusu;
    }

    public void setTambahanSusu(boolean tambahanSusu) {
        this.tambahanSusu = tambahanSusu;
    }


    public void display(){
        System.out.println("Coffee Order:");
        System.out.println("Type: " + kondisi);
        System.out.println("Size: " + size);
        System.out.println("Sugar: " + jumlahGula);
        System.out.println("Milk: " + tambahanSusu);
        }

}
