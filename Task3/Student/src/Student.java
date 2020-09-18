public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark) {
        this.firstName = firstName;
        this.averageMark = averageMark;
        this.group = group;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
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
