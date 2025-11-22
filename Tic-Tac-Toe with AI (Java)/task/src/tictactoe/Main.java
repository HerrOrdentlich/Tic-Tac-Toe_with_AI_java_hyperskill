package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cells: ");
        char[][] cells = new char[3][3];
        String input = sc.next();
        int counter = 0;
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = input.charAt(counter);
                counter++;
            }
        }
        displayBoard(cells);
    }

    public static void displayBoard(char[][] cells) {
        System.out.println("---------");
        System.out.println();
        for (int i = 0; i < 3; i++ ) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == 'X' || cells[i][j] == 'O') {
                    System.out.print(cells[i][j] + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" |");
        }
        System.out.println();
        System.out.println("---------");
    }

    public static char[][] nextMove(char[][] cells) {
        Scanner moveScanner = new Scanner(System.in);
        boolean moveValid = false;
        while (!moveValid) {
            System.out.println("Enter the coordinates: ");
            String move = moveScanner.nextLine();
            String[] coordinates = move.split(" ");
            String firstPart = coordinates[0];
            String secondPart = coordinates[1];
            int firstCoordinate;
            int secondCoordinate;
            try{
                firstCoordinate = Integer.parseInt(firstPart);
                secondCoordinate = Integer.parseInt(secondPart);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers");
                continue;
            }
            if (firstCoordinate < 1 || secondCoordinate < 1 || firstCoordinate > 3 || secondCoordinate > 3) {
                System.out.println("Coordinates should be form 1 to 3!");
            }
        }
        moveScanner.close();
    }
}
