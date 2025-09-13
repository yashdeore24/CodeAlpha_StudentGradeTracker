package CodeAlpha_Task_First;


import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100]; // Max 100 students
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Student Profile");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();

                    int[] marks = new int[8];
                    String[] subjects = {"Marathi","Hindi","English","Sanskrit","Math","Science","History","Geography"};
                    for (int i = 0; i < subjects.length; i++) {
                        System.out.print("Enter marks for " + subjects[i] + ": ");
                        marks[i] = sc.nextInt();
                    }

                    students[count++] = new Student(name, rollNo, marks);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Roll No to view profile: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == searchRoll) {
                            students[i].displayProfile();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found!");
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}


