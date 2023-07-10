package component;

public abstract class Beverage {
    String description = "NOTHING";
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public double cost() {
        if (size == Size.GRANDE) return 0.5;
        if (size == Size.VENTI) return 1.0;
        return 0.0;
    }
    public String getDescription() {
        return description;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() { return this.size; }
}