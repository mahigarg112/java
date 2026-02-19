class Faculty {
    String name;
    String department;
    int experienceYears;

    // Constructor
    Faculty(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + 
                           ", Department: " + department + 
                           ", Experience: " + experienceYears + " years");
    }
}

public class FacultyDemo {
    public static void main(String[] args) {

        Faculty[] facultyList = new Faculty[4];

        facultyList[0] = new Faculty("Aryan", "CSE", 5);
        facultyList[1] = new Faculty("Riya", "IT", 3);
        facultyList[2] = new Faculty("Karan", "ECE", 7);
        facultyList[3] = new Faculty("Neha", "ME", 4);

        for (int i = 0; i < facultyList.length; i++) {
            if (facultyList[i].name.equals("Riya")) {
                facultyList[i].department = "AI";
            }
        }

        for (int i = 0; i < facultyList.length; i++) {
            if (facultyList[i].name.equals("Karan")) {
                facultyList[i] = null; 
            }
        }

        System.out.println("Faculty Details:");
        for (int i = 0; i < facultyList.length; i++) {
            if (facultyList[i] != null) {
                facultyList[i].display();
            }
        }
    }
}
