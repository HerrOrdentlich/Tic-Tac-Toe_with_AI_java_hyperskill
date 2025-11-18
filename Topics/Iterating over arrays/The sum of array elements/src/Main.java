import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        input.close();
    }
}