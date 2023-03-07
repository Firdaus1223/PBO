public class Pemesanan {
    String nama;
    String pesanan;
    int jumlah;
    
    
    public Pemesanan(String nama, String pesanan, int jumlah){
        this.nama = nama;
        this.jumlah = jumlah;
        this.pesanan = pesanan;
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

    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
 
}