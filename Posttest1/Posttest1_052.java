import java.util.*; 
import java.io.*;

public class Posttest1_052 {

    static ArrayList<Pemesanan> pemesanan = new ArrayList<Pemesanan>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        
        while (true) {
            System.out.println(" ===== Login =====");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Keluar");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                admin();
            } else if (pilihan == 2){
                user();
            } else if (pilihan == 3){
                System.exit(0);
            } else {
                System.out.println("Pilihan yang anda masukan Tidak Tersedia");
            }
            System.out.println("\n");
        }

    }

    //User
    public static void user() throws IOException{
        while (true) {
            System.out.println(" ===== Pemesanan Kedai Kopi =====");
            System.out.println("1. Buat Pesanan");
            System.out.println("2. liat Pesanan");
            System.out.println("3. Ubah Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                User.createUser();
            } else if (pilihan == 2){
               User.readUser();
            } else if (pilihan == 3){
                User.updateUser();
            } else if (pilihan == 4){
                User.deleteUser();
            } else if (pilihan == 5){
                main(null);
            } else {
                System.out.println("Pilihan yang anda masukan Tidak Tersedia");
            }
            System.out.println("\n");
        }
    }



    //Admin
    public static void admin() throws IOException{
        while (true) {
            System.out.println("\n");
            System.out.println(" ===== Menu Admin =====");
            System.out.println("1. Buat Pesanan");
            System.out.println("2. liat Pesanan");
            System.out.println("3. Ubah Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                create();
            } else if (pilihan == 2){
                read();
            } else if (pilihan == 3){
                update();
            } else if (pilihan == 4){
                delete();
            } else if (pilihan == 5){
                main(null);
            } else {
                System.out.println("Pilihan yang anda masukan Tidak Tersedia");
            }
            System.out.println("\n");
        }
    }

    public static void menu() throws IOException{
        System.out.println("\n");
        System.out.println("========== MENU =========");
        System.out.println("      --- Makanan ---");
        System.out.println(" Kentang goreng : 20.000 ");
        System.out.println(" Donat          : 5.000 ");
        System.out.println(" Croissant      : 10.000 ");
        System.out.println("      --- Minuman ---");
        System.out.println(" Espresso       : 15.000 ");
        System.out.println(" Latte          : 15.000 ");
        System.out.println(" Cappuccino     : 15.000 ");
        System.out.println("=========================\n");
    }

    
    public static void create() throws IOException{
        menu();
        System.out.print("Masukan Nama Pembeli: ");
        String addnama = br.readLine();
        System.out.print("Masukan Nama Pesanan: ");
        String addpesanan = br.readLine();
        System.out.print("Masukan Jumlah Pesanan: ");
        int addjumlah = Integer.parseInt(br.readLine());
        Pemesanan pmsbaru = new Pemesanan(addnama, addpesanan, addjumlah); 
        pemesanan.add(pmsbaru);
        pmsbaru.registrasi();
    }

    public static void read() throws IOException{
        System.out.println(" ===== Data Pesanan =====");
        for (int i = 0; i < pemesanan.size(); i++) {
            System.out.println("Pesanan ke-" + (i+1));
            System.out.println("Nama Pembeli: " + pemesanan.get(i).nama);
            System.out.println("Nama Pesanan: " + pemesanan.get(i).pesanan);
            System.out.println("Jumlah Pesanan: " + pemesanan.get(i).jumlah);
        }
    }
    
    public static void update() throws IOException{
        System.out.println("\n");
        read();

        System.out.println(" ===== Ubah Data Pesanan =====");
        System.out.print("Masukan Pembeli ke-");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nama Pembeli: ");
        String setNAMA = br.readLine();
        System.out.print("Masukan Nama Pesanan: ");
        String setPESANAN = br.readLine();
        System.out.print("Masukan Jumlah Pesanan: ");
        int setJumlah = Integer.parseInt(br.readLine());

        pemesanan.get(index-1).nama = setNAMA;
        pemesanan.get(index-1).pesanan = setPESANAN;
        pemesanan.get(index-1).jumlah = setJumlah;

        pemesanan.get(index-1).terupdate();
        System.out.println("\n");
    }

    public static void delete() throws IOException{
        System.out.println("\n");
        read();
        System.out.println(" ===== Hapus Data Pesanan =====");
        System.out.print("Masukan Data Pesanan ke-");
        int index = Integer.parseInt(br.readLine());

        pemesanan.remove(index-1).terhapus();;  
        System.out.println("\n");  
    }
}