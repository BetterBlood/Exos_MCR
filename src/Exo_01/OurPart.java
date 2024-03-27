package Exo_01;

public abstract class OurPart extends Part{
    private double proportion = 1;
    public OurPart(double price, double proportion) {
        super(price);
        this.proportion = proportion;
    }

    public void setProportion(double proportion) {
        this.proportion = proportion;
    }

    public double getProportion() {
        return proportion;
    }
}
