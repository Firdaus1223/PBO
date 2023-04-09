package Posttest6;

import java.util.*;
import java.io.*;

public class Customer {
    static ArrayList<Minuman> minuman = new ArrayList<Minuman>();
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
        System.out.print("Masukan jenis Pesanan: ");
        String addpesanan = br.readLine();
        System.out.print("Masukan jumlah Pesanan: ");
        int addjumlah = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nama pesanan: ");
        String addjeniskopi = br.readLine();
        System.out.print("Masukan jumlah gula: ");
        int addjumlahGula = Integer.parseInt(br.readLine());
        System.out.print("Masukan pilihan mau tambah susu atau tidak (true/false): ");
        String tambahSusu = br.readLine();
        boolean addtambahanSusu = Boolean.parseBoolean(tambahSusu);
        System.out.print("Masukan kondisi  minuman (panas/dingin): ");
        String addkondisi = br.readLine();
        System.out.print("Masukan ukuran gelas(S/M/B): ");
        String addsize = br.readLine();
        Minuman mnm = new Minuman(addnama, addpesanan, addjumlah,addjeniskopi, addjumlahGula, addkondisi, addsize, addtambahanSusu);
        minuman.add(mnm);
        mnm.registrasiminuman();
        mnm.pesanKopi(addjeniskopi);
        mnm.pesanKopi(addjeniskopi, addjumlahGula, addtambahanSusu);
    }

    public static void readUser() throws IOException{
        System.out.println(" ===== Data Pesanan =====");
        for (int i = 0; i < pemesanan.size(); i++) {
            System.out.println("Pesanan ke-" + (i+1));
            System.out.println("Nama Pembeli: " + pemesanan.get(i).getNama());
            System.out.println("Nama Pesanan: " + pemesanan.get(i).getPesanan());
            System.out.println("Jumlah Pesanan: " + pemesanan.get(i).getJumlah());
        }
        for (int i = 0; i < minuman.size(); i++) {
            System.out.println("kondisi minuman: " + minuman.get(i).getKondisi());
            System.out.println("ukuran gelas: " + minuman.get(i).getSize());
        }
    }
    
    public static void updateUser() throws IOException{
        System.out.println("\n");
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
        System.out.print("Masukan kondisi  minuman (panas/dingin): ");
        String setkondisi = br.readLine();
        System.out.print("Masukan ukuran gelas(S/M/B): ");
        String setsize = br.readLine();

        pemesanan.get(index-1).setNama(setNAMA); 
        pemesanan.get(index-1).setPesanan(setPESANAN); 
        pemesanan.get(index-1).setJumlah(setJumlah);
        minuman.get(index-1).setKondisi(setkondisi);
        minuman.get(index-1).setSize(setsize);

        pemesanan.get(index-1).terupdate();
        minuman.get(index-1).terupdateminuman();
        System.out.println("\n");
    }

    public static void deleteUser() throws IOException{
        System.out.println("\n");
        readUser();
        System.out.println(" ===== Hapus Data Pesanan =====");
        System.out.print("Masukan Data Pesanan ke-");
        int index = Integer.parseInt(br.readLine());

        pemesanan.remove(index-1).terhapus();;
        minuman.remove(index-1).terhapusminuman();
        System.out.println("\n");
    }
}
