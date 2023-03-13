package Posttest2;

class Pemesanan {
    private String nama;
    private String pesanan;
    private int jumlah;
    

    public Pemesanan(String nama, String pesanan, int jumlah) {
        this.nama = nama;
        this.pesanan = pesanan;
        this.jumlah = jumlah;
    }


    // method
    public void registrasi(){
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Pesanan: " + this.pesanan);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Pesanan Telah Dibuat");
    }
    
    public void terupdate(){
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Pesanan: " + this.pesanan);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Pesanan Telah Dibuat");
    }

    public void terhapus(){
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Pesanan: " + this.pesanan);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Pesanan Telah Dihapus");
    }


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesanan() {
        return this.pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }



}
 
