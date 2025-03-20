package Matrizes;

public class matriz4 {
    public static void main(String[] args) {
        int[] valores = { 1, 3, 12, 55, 7};
        try {
            valores[5] = 14;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("erro " + e.getMessage());
        }
        
    }
}
