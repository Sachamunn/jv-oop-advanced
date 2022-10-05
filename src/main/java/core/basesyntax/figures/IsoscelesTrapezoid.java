package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(double leg, double firstBase, double secondBase, String color) {
        this.color = color;
        this.leg = leg;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public void draw() {
        System.out.print("\nType: isosceles trapezoid"
                + "\nLeg: " + leg
                + "\nFirst base: " + firstBase
                + "\nSecond base: " + secondBase
                + "\nColor: " + color
                + "\n-----------");
    }
}