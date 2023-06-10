import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matakuliahTersedia = {"PBO", "IMK", "SISTEM OPERASI", "JARINGAN KOMPUTER"};

        System.out.println("Matakuliah yang tersedia:");
        for (int i = 0; i < matakuliahTersedia.length; i++) {
            System.out.println((i + 1) + ". " + matakuliahTersedia[i]);
        }

        System.out.print("Pilih matakuliah (1-" + matakuliahTersedia.length + "): ");

        int pilihanMatakuliah;

        if (scanner.hasNextInt()) {
            pilihanMatakuliah = scanner.nextInt();
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        if (pilihanMatakuliah < 1 || pilihanMatakuliah > matakuliahTersedia.length) {
            System.out.println("Pilihan matakuliah tidak valid.");
            scanner.close();
            return;
        }

        String matakuliah = matakuliahTersedia[pilihanMatakuliah - 1];

        System.out.print("Masukkan nilai kehadiran: ");

        int nilaiKehadiran;

        if (scanner.hasNextInt()) {
            nilaiKehadiran = scanner.nextInt();
        } else {
            System.out.println("Input tidak valid.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan nilai UTS: ");

        int nilaiUTS;

        if (scanner.hasNextInt()) {
            nilaiUTS = scanner.nextInt();
        } else {
            System.out.println("Input tidak valid.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan nilai UAS: ");

        int nilaiUAS;

        if (scanner.hasNextInt()) {
            nilaiUAS = scanner.nextInt();
        } else {
            System.out.println("Input tidak valid.");
            scanner.close();
            return;
        }

        double kontribusiKehadiran;
        if (nilaiKehadiran < 3) {
            kontribusiKehadiran = 0;
        } else if (nilaiKehadiran <= 4) {
            kontribusiKehadiran = 60;
        } else if (nilaiKehadiran <= 6) {
            kontribusiKehadiran = 80;
        } else {
            kontribusiKehadiran = 100;
        }

        double nilaiAkhir = (kontribusiKehadiran * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.5);

        System.out.println("Nilai Akhir untuk matakuliah " + matakuliah + ": " + nilaiAkhir);

        String nilaiGrade;
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            nilaiGrade = "A";
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 85) {
            nilaiGrade = "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 70) {
            nilaiGrade = "C";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiGrade = "D";
        } else {
            nilaiGrade = "E";
        }

        System.out.println("Nilai Grade: " + nilaiGrade);

        scanner.close();
    }
}
