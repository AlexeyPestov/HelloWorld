package RAM;

public class RAMWorkFactory extends RAMFactory {
    @Override
    public RAM createRAM() {
        return new RAMWork();
    }
}
