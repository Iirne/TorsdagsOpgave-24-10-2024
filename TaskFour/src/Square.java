public class Square implements Shape {
    private double Sides;

    public Square(double radius) {
        this.Sides = radius;
    }
    public double getSides() {
        return Sides;
    }
    public void setSides(double sides) {
        this.Sides = sides;
    }
    public double getArea() {
        return Sides * Sides;
    }
}
