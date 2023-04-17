package array_demo;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] num= new int[2][3];
        num[0][0]=10;
        num[0][1]=20;
        num[0][2]=30;
        num[1][0]=40;
        num[1][1]=50;
        num[1][2]=60;

        for (int row=0;row<2;row++) { //row=0
            for (int col=0;col<3;col++) { //row=0,col=0
                System.out.print(" "+num[row][col]);
                //col++
            }
            System.out.println();
            //row++
        }
    }
}
