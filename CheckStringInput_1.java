import java.util.Scanner;

public class CheckStringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap mot chuoi: ");
        
        // Kiem tra xem dau vao co phai la chuoi khong
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("Dau vao la chuoi: " + input);
        } else {
            System.out.println("Dau vao khong phai la chuoi.");
        }
        
        scanner.close();
    }
}
