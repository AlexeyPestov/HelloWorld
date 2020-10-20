package RAM;

import Types.ComputerType;

public class RAMFactory {
    public RAM createRAM(ComputerType computerType)  {
        if (computerType == ComputerType.HOME)  {
            return new RAM("Apple", 2000, 780, "Type1");
        }
        return new RAM("Microsoft", 1000, 390, "Type2");
    }
}
