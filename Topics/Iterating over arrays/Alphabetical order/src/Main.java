import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean inOrder = true;

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i+1]) > 0) {
                inOrder = false;
                break;
            }
        }

        System.out.println(inOrder);
        scanner.close();
    }
}