package Fruits;

public abstract class Fruit {
    float weight;
    boolean inBox = false;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isInBox() {
        return inBox;
    }

    public void setInBox(boolean inBox) {
        this.inBox = inBox;
    }

    public Class getCL()    {
        return this.getClass();
    }
}
