public class Main {
    public static void main(String[] args) {
        ShapeBuilder shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShape(new Circle(0.2));
        shapeBuilder.addShape(new Circle(3));
        shapeBuilder.addShape(new Circle(5));
        shapeBuilder.addShape(new Square(3));
        shapeBuilder.addShape(new Square(7));

        System.out.println(shapeBuilder.getTotalArea());
    }
}