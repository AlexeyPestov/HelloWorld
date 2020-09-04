public class Student {
    private String firstName;
    private String lastName;
    private String group;
    Double averageMark;

    public Student(String firstName, Double averageMark) {
        this.firstName = firstName;
        this.averageMark = averageMark;
    }

    public Integer getScholarship() {
        if (averageMark == 5)   {
            return 100;
        }
        return 80;
    }
}
