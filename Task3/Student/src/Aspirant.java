public class Aspirant extends Student {

    private String nameScientigicWork;

    public Aspirant(String firstName, String lastName, String group, Double averageMark, String nameScientigicWork) {
        super(firstName, lastName, group, averageMark);
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
