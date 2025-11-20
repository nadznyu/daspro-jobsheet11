import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        System.out.println("Menu 1: Input data penonton");
        System.out.println("Menu 2: Tampilkan daftar penonton");
        System.out.println("Menu 3: Exit");

        while (true) {
            System.out.print("Pilih menu 1/2/3: ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                System.out.println();
                System.out.println("=== DATA PENONTON ===");
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                int baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                int kolom = sc.nextInt();
                sc.nextLine();

            if (penonton[baris-1][kolom-1] == null) {
                penonton[baris-1][kolom-1] = nama;
                System.out.println("Data penonton tersimpan!");
                } else {
                    System.out.println("Kursi sudah ditempati oleh: "+penonton[baris-1][kolom-1]);
                    System.out.println("Input kursi lain!");
                }
                } else if (menu == 2) {
                    System.out.println();
                    System.out.println("=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                    System.out.println(String.join(" ", penonton[i]));
                } 
                } else if (menu == 3) {
                    System.out.println("Input data penonton selesai!");
                    break;
                } 
            }
        }
    }

