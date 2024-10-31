import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Nhap nam sinh (dd/MM/yyyy): ");
        String dateOfBirthInput = scanner.nextLine();
        Date dateOfBirth = null;
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false); 
            dateOfBirth = dateFormat.parse(dateOfBirthInput);
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le. Vui long nhap lai theo dinh dang dd/MM/yyyy.");
            System.exit(0); 
        }
        
        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        
        System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();
        
        System.out.print("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Nhap que quan: ");
        String hometown = scanner.nextLine();
        
        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nam sinh: " + outputDateFormat.format(dateOfBirth));
        
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + hometown);

        scanner.close();
    }
}
