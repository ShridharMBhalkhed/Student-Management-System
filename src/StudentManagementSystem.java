import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void addStudent(Scanner sc) {
        try {
            FileWriter writer = new FileWriter("students.txt", true);

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            writer.write(id + "," + name + "," + course + "\n");
            writer.close();
            System.out.println("✅ Student details saved.");
        } catch (IOException e) {
            System.out.println("❌ Error writing file.");
        }
    }

    public static void viewStudents() {
        try {
            File file = new File("students.txt");
            Scanner reader = new Scanner(file);

            System.out.println("\n--- All Students ---");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] parts = data.split(",");
                System.out.println("ID: " + parts[0] + ", Name: " + parts[1] + ", Course: " + parts[2]);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("❌ No student records found.");
        }
    }
}
