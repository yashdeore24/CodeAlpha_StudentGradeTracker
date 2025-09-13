package CodeAlpha_Task_First;

public class Student {
    String name;
    int rollNo;
    int[] marks;
    String[] subjects = {"Marathi","Hindi","English","Sanskrit","Math","Science","History","Geography"};

    // Constructor
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Display profile of student
    public void displayProfile() {
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        int total = 0, highest = marks[0], lowest = marks[0];
        String highSub = subjects[0], lowSub = subjects[0];

        // Show marks, highest & lowest
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
            total += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
                highSub = subjects[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
                lowSub = subjects[i];
            }
        }

        double average = total / (double) marks.length;
        double percentage = (total / (double)(marks.length * 100)) * 100;

        // Grade calculation
        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 60) grade = 'C';
        else if (percentage >= 40) grade = 'D';
        else grade = 'F';

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Highest Marks in: " + highSub + " (" + highest + ")");
        System.out.println("Lowest Marks in: " + lowSub + " (" + lowest + ")");
        System.out.println("Grade: " + grade);
    }
}


