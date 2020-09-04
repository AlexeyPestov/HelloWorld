public class Aspirant extends Student {
    public Aspirant(String firstName, Double averageMark) {
        super(firstName, averageMark);
    }

    @Override
public Integer getScholarship() {
    if (super.averageMark == 5)   {
        return 200;
    }
    return 180;
}
}
