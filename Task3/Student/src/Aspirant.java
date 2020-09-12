public class Aspirant extends Student {

    public Aspirant(String firstName, Double averageMark) {
        super(firstName, averageMark);
    }

    @Override
    public int getScholarship() {
        if (super.getAverageMark() == 5) {
            return 200;
        }
        return 180;
    }
}
