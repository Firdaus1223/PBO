package Posttest3;

import java.util.*;

import java.io.*;

public class Posttest3_052 {
    
    static ArrayList<Makanan> makanan = new ArrayList<Makanan>();
    static ArrayList<Minuman> minuman = new ArrayList<Minuman>();
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
                System.out.println("\n");
            } else {
                System.out.println("Pilihan yang anda masukan Tidak Tersedia");
            }
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
        System.out.print("Masukan  Tipe pesanan (ringan/berat): ");
        String addtipe = br.readLine();
        System.out.print("Masukan Deskripsi Makanana: ");
        String adddeskripsi = br.readLine();
        Makanan mkn = new Makanan(addnama, addpesanan,addjumlah, addtipe, adddeskripsi);
        makanan.add(mkn);
        pmsbaru.registrasi();
        mkn.registrasimakanan();
    }

    public static void read() throws IOException{
        System.out.println(" ===== Data Pesanan =====");
        for (int i = 0; i < pemesanan.size(); i++) {
            System.out.println("Pesanan ke-" + (i+1));
            System.out.println("Nama Pembeli: " + pemesanan.get(i).getNama());
            System.out.println("Nama Pesanan: " + pemesanan.get(i).getPesanan());
            System.out.println("Jumlah Pesanan: " + pemesanan.get(i).getJumlah());
        }
        for (int i = 0; i < makanan.size(); i++) {
            System.out.println("Tipe pesesanan: " + makanan.get(i).getTipe());
            System.out.println("deskripsi pesanan: " + makanan.get(i).getDeskripsi());
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
        System.out.print("Masukan Tipe pesanan (ringan/berat): ");
        String setTipe = br.readLine();
        System.out.print("Masukan deskripsi Pesanan: ");
        String setDeskripsi = br.readLine();

        pemesanan.get(index-1).setNama(setNAMA); 
        pemesanan.get(index-1).setPesanan(setPESANAN); 
        pemesanan.get(index-1).setJumlah(setJumlah);
        makanan.get(index-1).setTipe(setTipe); 
        makanan.get(index-1).setDeskripsi(setDeskripsi); 

        pemesanan.get(index-1).terupdate();
        makanan.get(index-1).terupdatemakanan();
        System.out.println("\n");
    }

    public static void delete() throws IOException{
        System.out.println("\n");
        read();
        System.out.println(" ===== Hapus Data Pesanan =====");
        System.out.print("Masukan Data Pesanan ke-");
        int index = Integer.parseInt(br.readLine());

        pemesanan.remove(index-1).terhapus();;  
        makanan.remove(index-1).terhapusmakanan();;
        System.out.println("\n");  
    }

}