import java.util.Scanner;

public class ParkirCalculator {

    public static double hitungParkir(int hours) {
        // Biaya flat untuk 24 jam
        double duaempatjamRate = 15.0;
        // Biaya untuk 5 jam pertama
        double limajampertamaRate = 1.0;
        // Biaya per jam setelah 5 jam pertama
        double kelebihanjamRate = 0.5;

        if (hours <= 5) {
            // Hitung rate parkir selama 5 jam pertama
            return limajampertamaRate;
        } else if (hours < 24) {
            // Hitung rate parkir kurang dari 24 jam
            return limajampertamaRate + (hours - 5) * kelebihanjamRate;
        } else if (hours == 24) {
            // Hitung rate parkir sama dengan 24 jam
            return duaempatjamRate;
        }else {
            // Hitung kelebihan waktu setelah 24 jam
            int extraHours = hours - 24;
            return duaempatjamRate + extraHours * kelebihanjamRate;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah jam parkir: ");
        int hours = scanner.nextInt();

        double fee = hitungParkir(hours);
        System.out.printf("Biaya parkir: $%.2f%n", fee);
    }
}
