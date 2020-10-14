package GraphicsCard;

public class GraphicsCardWorkFactory extends GraphicsCardFactory {
    @Override
    public GraphicsCard createGraphics() {
        return new GraphicsCardWork();
    }
}
