import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine(); // Membaca baris teks dari input pengguna
        int age = validateUmur(scanner);
        boolean isMarried = validateMarried(scanner);

        System.out.println("Hallo "+name);
        System.out.println("Usia mu "+age+" tahun");
        System.out.print("Dan kamu ");
        tampilStatus(isMarried);

    }

    public static int validateUmur(Scanner scanner){
        int age;

        while (true){
            System.out.print("Masukan umur anda : ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                break;
            }
            else {
                System.out.println("Inputan Salah, hanya bisa memasukkan angka !!!");
                scanner.next();
            }
        }
        return age;
    }

    public  static boolean validateMarried(Scanner scanner){
        boolean isMarried;
        while (true){
            System.out.print("Apakah Anda sudah menikah? (true/false): ");
            if (scanner.hasNextBoolean()) {
                isMarried = scanner.nextBoolean();
                break;
            }
            else {
                System.out.println("Inputan Salah, hanya boleh memasukan TRUE and FALSE !!!");
                scanner.next();
            }
        }
        return isMarried;
    }

    public static void tampilStatus(Boolean isMarried){
        if (isMarried){
            System.out.print("sudah ");
        } else {
            System.out.print("belum ");
        }
        System.out.print("menikah");
    }
}