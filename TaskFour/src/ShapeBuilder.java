import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public double getTotalArea(){
        double totalArea = 0;
        for(Shape s : shapes){
           totalArea += s.getArea();
        }
        return totalArea;
    }

}
