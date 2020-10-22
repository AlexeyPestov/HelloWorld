package GraphicsCard;

import Types.ComputerType;
import Types.CoolingType;

public class GraphicsCardFactory {
    public static GraphicsCard createGraphics(ComputerType computerType)    {
        if (computerType == ComputerType.HOME) {
            return new GraphicsCard("Nivida",77799, "A", CoolingType.ACTIVE);
        }
        return new GraphicsCard("NividaS",77454, "B", CoolingType.PASSIVE);
        }
    }
