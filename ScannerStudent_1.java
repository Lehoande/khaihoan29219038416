

import java.util.Scanner;

public class ScannerStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
      
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        
        System.out.print("Nhập chuyên ngành: ");
        String major = scanner.nextLine();
        
        System.out.print("Nhập GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập quê quán: ");
        String hometown = scanner.nextLine();
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Chuyên ngành: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Quê quán: " + hometown);

        scanner.close();
    }
}
