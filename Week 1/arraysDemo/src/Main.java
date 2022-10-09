public class Main {
    public static void main(String[] args) {

        String[] students = {"Berk", "Ekko","Spongebob"};

        // Normal For
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        // For-Each
        for (String student : students) {
            System.out.println(student);
        }
    }
}