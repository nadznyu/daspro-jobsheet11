import java.util.Scanner;

public class TugasArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][6];

        System.out.println("=== DATA HASIL SURVEY ===");
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.println("Responden ke-" + (i + 1));

            int nilai = 0;
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Nilai Pertanyaan ke-" + (j + 1) + " (1-5): ");
                data[i][j] = sc.nextInt();
                while (data[i][j] < 1 || data[i][j] > 5) {
                    System.out.println("Masukkan nilai yang valid! (1-5)");
                    System.out.print("Nilai Pertanyaan ke-" + (j + 1) + " (1-5): ");
                    data[i][j] = sc.nextInt();
                }
                nilai += data[i][j];
            }
            double rataRata = nilai / 6.0;
            System.out.println("Rata-rata nilai: " + rataRata);
            System.out.println();
        }
        System.out.println("=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < data[0].length; j++) {
            int totalPerPertanyaan = 0;
            for (int i = 0; i < data.length; i++) {
                totalPerPertanyaan += data[i][j];
            }
            double rataRataPertanyaan = totalPerPertanyaan / 10.0;
            System.out.println("Rata-rata Pertanyaan ke-" + (j + 1) + " : " + rataRataPertanyaan);
        }
        int totalKeseluruhan = 0;
        int jmlResponden = data.length;
        int jmlPertanyaan = data[0].length;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                totalKeseluruhan += data[i][j];
            }
        }
        System.out.println();
        double rataRataKeseluruhan = totalKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("Rata-rata Keseluruhan adalah: " + rataRataKeseluruhan);
    }
}
