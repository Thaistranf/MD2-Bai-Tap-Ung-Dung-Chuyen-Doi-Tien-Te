import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền đô: ");
        long dollar = sc.nextLong();

        long vnd = dollar * rate;
        System.out.printf("Result: %d", vnd);
    }
}