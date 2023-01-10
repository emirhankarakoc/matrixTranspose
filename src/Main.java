import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrisin enini giriniz.");
        int n = scanner.nextInt();
        System.out.println("Matrisin boyunu giriniz.");
        int m = scanner.nextInt();
        int[][] matris = new int[n][m];
        int[][] trans = new int[m][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.println(i+">");
                matris[i][j] = scanner.nextInt();
            }
        }for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                trans[j][i] = matris[i][j];
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++)
            {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();}




    }
}