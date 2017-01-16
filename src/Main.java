import shape.domain.Circle;
import shape.domain.DomainObject;
import shape.domain.Triangle;
import shape.service.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ShapeService circleService = new CircleServiceImpl();
        circleService.showShapes();
        circleService.addShape(new Circle(0, "Circle5", "Lime", 10));
        circleService.addShape(new Circle(0, "Circle6", "Aqua", 8));
        circleService.showShapes();
        DomainObject obj = (Circle)circleService.getShapeById(3);
        System.out.println("Circle 3: " + obj);

        System.out.println("========================================");
        ShapeService triangleService = new TriangleServiceImpl();
        triangleService.showShapes();
        triangleService.addShape(new Triangle(0, "Triangle3", "Mustard", Boolean.FALSE));
        triangleService.addShape(new Triangle(0, "Triangle4", "White", Boolean.TRUE));
        triangleService.showShapes();
    }
}
