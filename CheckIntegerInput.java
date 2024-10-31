import java.util.Scanner;

public class CheckIntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen: ");
        
        // Kiem tra xem dau vao co phai la so nguyen khong
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            System.out.println("Dau vao la so nguyen: " + input);
        } else {
            System.out.println("Dau vao khong phai la so nguyen.");
        }
        
        scanner.close();
    }
}

