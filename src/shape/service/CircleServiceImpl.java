package shape.service;

import shape.domain.Circle;
import shape.domain.DomainObject;
import shape.domain.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public class CircleServiceImpl extends AbstractShapeService implements CircleService {

    @Override
    protected void loadShapes() {
        System.out.println("Loading circles");
        Integer key = super.getNextKey();
        domainMap.put(key, new Circle(key, "Circle1", "Green", 3));
        key = super.getNextKey();
        domainMap.put(key, new Circle(key, "Circle2", "Blue", 4));
        key = super.getNextKey();
        domainMap.put(key, new Circle(key, "Circle3", "Red", 1));
    }

    @Override
    public void showShapes() {
        System.out.println("Showing all circles: ");
        List<DomainObject> circles = getAllShapes();

        for (DomainObject domainObj : circles) {
            Circle c = (Circle)domainObj;
            System.out.println("Circle " + c.getName() + " with id " + c.getId() + " has radius " + c.getRadius());
        }
    }

    @Override
    public Circle getShapeById(Integer id) {
        return (Circle)super.getShapeById(id);
    }

    @Override
    public void addShape(Circle circle) {
        System.out.println("Adding circle: " + circle);
        Integer key = super.getNextKey();
        circle.setId(key);
        domainMap.put(key, circle);
    }

    @Override
    public List<DomainObject> getAllShapes() {
        System.out.println("We have " + domainMap.size() + " circles");
        return new ArrayList<>(domainMap.values());
    }
}
