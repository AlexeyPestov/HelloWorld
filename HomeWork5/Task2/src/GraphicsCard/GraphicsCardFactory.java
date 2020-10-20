package GraphicsCard;

import Types.ComputerType;
import Types.TypeCooling;

public class GraphicsCardFactory {
    public GraphicsCard createGraphics(ComputerType computerType)    {
        if (computerType == ComputerType.HOME) {
            return new GraphicsCard("Nivida",77799, "A", TypeCooling.ACTIVE);
        }
        return new GraphicsCard("NividaS",77454, "B", TypeCooling.PASSIVE);
        }
    }
