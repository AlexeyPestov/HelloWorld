public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alexey", "Pestov", "123", 4.5);
        Student student2 = new Aspirant("Sergey", "Konkov", "456", 5.0, "Теория графов");
        Student[] students = new Student[]{student, student2};
        for (Student st : students) {
            System.out.println(st.getScholarship());
        }
    }
}
