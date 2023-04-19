package array_demo;

public class OutputProgramm {
    public static void main(String[] args) {
        int[][] A = new int[4][5];
        int k=0;

        // 0 1 2 3 4
        // 5 6 7 8 9
        // 10 11 12 13 14
        // 15 16 17 18 19
        for (int row = 0; row < 4; row++) { //row=o
            for (int col = 0; col < 5; col++) {// row=0,col1=5
              A[row][col]=k;
              k++;
            }
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }
    }
}
