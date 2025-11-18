import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int width = twoDimArray.length;
        int height = twoDimArray[0].length;
        System.out.print(twoDimArray[0][0] + " ");
        System.out.println(twoDimArray[0][height - 1]);
        System.out.print(twoDimArray[width - 1][0] + " ");
        System.out.println(twoDimArray[width - 1][height - 1]);
    }
}