public class Aspirant extends Student {

    private String nameScientigicWork;

    public Aspirant(String firstName, Double averageMark, String nameScientigicWork) {
        super(firstName, averageMark);
        this.nameScientigicWork = nameScientigicWork;
    }

    @Override
    public int getScholarship() {
        if (super.getAverageMark() == 5) {
            return 200;
        }
        return 180;
    }
}
