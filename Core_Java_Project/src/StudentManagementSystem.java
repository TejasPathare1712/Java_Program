import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // Sorting by name
    }
}

public class StudentManagementSystem {
    private static List<Student> studentList = new ArrayList<>();
    private static Map<Integer, Student> studentMap = new HashMap<>();

    public static void addStudent(Student student) {
        studentList.add(student);
        studentMap.put(student.getId(), student);
        System.out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void searchStudentById(int id) {
        Student student = studentMap.get(id);
        if (student != null) {
            System.out.println("Student Found: " + student);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    public static void sortStudentsByName() {
        Collections.sort(studentList);
        System.out.println("Students sorted by name.");
    }

    public static void sortStudentsByMarks() {
        studentList.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("Students sorted by marks.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Sort Students by Marks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    addStudent(new Student(id, name, marks));
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    searchStudentById(searchId);
                    break;

                case 4:
                    sortStudentsByName();
                    viewStudents();
                    break;

                case 5:
                    sortStudentsByMarks();
                    viewStudents();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
