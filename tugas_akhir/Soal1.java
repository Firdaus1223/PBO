import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        String awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        String[] splitArray = awal.split(" ");
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("String Awal\t" + awal);
        
        System.out.println("\nTampilkan ke Layar:");
        System.out.println("1\t" + splitArray[0] + " " + splitArray[1] + " " + splitArray[2]);
        System.out.println("2\t" + splitArray[0].toLowerCase() + " " + splitArray[1] + " " + splitArray[2]);
        System.out.println("3\t" + awal.toUpperCase());
        System.out.println("4\t" + splitArray[3]);
        System.out.println("5\t" + splitArray[4] + " " + splitArray[5] + " " + splitArray[6] + " " + splitArray[7]);
        
        String[] menu = {
            splitArray[0] + " " + splitArray[1] + " " + splitArray[2],
            splitArray[0].toLowerCase() + " " + splitArray[1] + " " + splitArray[2],
            awal.toUpperCase(),
            splitArray[3],
            splitArray[4] + " " + splitArray[5] + " " + splitArray[6] + " " + splitArray[7]
        };
        
        System.out.println("\nMenu untuk memilih output yang akan ditampilkan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println((menu.length + 1) + ". Keluar");
        
        do {
            System.out.println("\nPilih pilihan (1-" + (menu.length + 1) + "):");
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= menu.length) {
                System.out.println((choice) + "\t" + menu[choice - 1]);
            } else if (choice == menu.length + 1) {
                System.out.println("Keluar");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
            
        } while (choice != menu.length + 1);
        
        scanner.close();
    }
}
