public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, Double averageMark) {
        this.firstName = firstName;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 100;
        }
        return 80;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
