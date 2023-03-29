package Posttest4;

class Pemesanan {
    private String nama;
    private String pesanan;
    private int jumlah;
    private String jenisKopi;
    private int jumlahGula;
    

    public Pemesanan(String nama, String pesanan, int jumlah, String jeniskopi, int jumlahGula) {
        this.nama = nama;
        this.pesanan = pesanan;
        this.jumlah = jumlah;
    }


    // method
    public void registrasi(){
        System.out.println("\n");
        System.out.println("=============================");
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Pesanan: " + this.pesanan);
        System.out.println("Jumlah pesanan: " + this.jumlah);
    }
    
    public void terupdate(){
        System.out.println("\n");
        System.out.println("=============================");
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Pesanan: " + this.pesanan);
        System.out.println("Jumlah pesanan: " + this.jumlah);
    }

    public void terhapus(){
        System.out.println("\n");
        System.out.println("=============================");
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Pesanan: " + this.pesanan);
        System.out.println("Jumlah pesanan: " + this.jumlah);
    }

    public void pesanKopi(String jenisKopi) {
        System.out.println("Anda memesan kopi " + jenisKopi);
    }

    public void pesanKopi(String jenisKopi, int jumlahGula) {
        System.out.println("Anda memesan kopi " + jenisKopi + " dengan " + jumlahGula + " gula");
    }


    public String getJenisKopi() {
        return this.jenisKopi;
    }

    public void setJenisKopi(String jenisKopi) {
        this.jenisKopi = jenisKopi;
    }

    public int getJumlahGula() {
        return this.jumlahGula;
    }

    public void setJumlahGula(int jumlahGula) {
        this.jumlahGula = jumlahGula;
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
 
