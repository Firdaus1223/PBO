import java.util.*; 
import java.io.*;

public class User {
    static ArrayList<Pemesanan> pemesanan = new ArrayList<Pemesanan>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void menu() throws IOException{
        System.out.println("========== MENU =========");
        System.out.println("      --- Makanan ---");
        System.out.println(" Kentang goreng : 20.000 ");
        System.out.println(" Donat          : 5.000 ");
        System.out.println(" Croissant      : 10.000 ");
        System.out.println("      --- Minuman ---");
        System.out.println(" Espresso       : 15.000 ");
        System.out.println(" Latte          : 15.000 ");
        System.out.println(" Cappuccino     : 15.000 ");
        System.out.println("=========================");
    }

    public static void createUser() throws IOException{
        menu();
        System.out.print("Masukan Nama: ");
        String addnama = br.readLine();
        System.out.print("Masukan Pesanan: ");
        String addpesanan = br.readLine();
        System.out.print("Masukan Jumlah: ");
        int addjumlah = Integer.parseInt(br.readLine());
        Pemesanan pmsbaru = new Pemesanan(addnama, addpesanan, addjumlah); 
        pemesanan.add(pmsbaru);
        pmsbaru.registrasi();
    }

    public static void readUser() throws IOException{
        System.out.println(" ===== Data Pesanan =====");
        for (int i = 0; i < pemesanan.size(); i++) {
            System.out.println("Pesanan ke-" + (i+1));
            System.out.println("Nama Pembeli: " + pemesanan.get(i).nama);
            System.out.println("Nama Pesanan: " + pemesanan.get(i).pesanan);
            System.out.println("Jumlah Pesanan: " + pemesanan.get(i).jumlah);
        }
    }
    
    public static void updateUser() throws IOException{

        readUser();

        System.out.println(" ===== Ubah Data Pesanan =====");
        System.out.print("Masukan Pembeli ke-");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nama: ");
        String setNAMA = br.readLine();
        System.out.print("Masukan Pesanan: ");
        String setPESANAN = br.readLine();
        System.out.print("Masukan Jumlah: ");
        int setJumlah = Integer.parseInt(br.readLine());

        pemesanan.get(index-1).nama = setNAMA;
        pemesanan.get(index-1).pesanan = setPESANAN;
        pemesanan.get(index-1).jumlah = setJumlah;

        pemesanan.get(index-1).terupdate();
    }

    public static void deleteUser() throws IOException{
        readUser();
        System.out.println(" ===== Hapus Data Pesanan =====");
        System.out.print("Masukan Data Pesanan ke-");
        int index = Integer.parseInt(br.readLine());

        pemesanan.remove(index-1).terhapus();;
    }
}
