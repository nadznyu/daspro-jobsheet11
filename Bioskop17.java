public class Bioskop17 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
    }
}
