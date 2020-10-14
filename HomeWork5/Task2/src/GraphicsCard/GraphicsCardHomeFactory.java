package GraphicsCard;

public class GraphicsCardHomeFactory extends GraphicsCardFactory {
    @Override
    public GraphicsCard createGraphics() {
        return new GraphicsCardHome();
    }
}
