package RAM;

public class RAMHomeFactory extends RAMFactory {
    @Override
    public RAM createRAM() {
        return new RAMHome();
    }
}
