import java.util.*;

class StudentData {
    String rollNo;
    float[] marks;
    float total;
    float percentage;

    StudentData(String rollNo, float[] marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        calculate();
    }

    void calculate() {
        total = 0;
        for (float m : marks) {
            total += m;
        }
        percentage = total / marks.length;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.print("Marks: ");
        for (float m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("------------------------");
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentData> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            String roll = sc.next();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            float[] marks = new float[subjects];

            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++) {
                marks[j] = sc.nextFloat();
            }

            StudentData s = new StudentData(roll, marks);
            list.add(s);
        }

        System.out.println("\n--- Student Details ---");
        for (StudentData s : list) {
            s.display();
        }

        sc.close();
    }
}