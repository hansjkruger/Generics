package shape.service;

import shape.domain.Circle;
import shape.domain.DomainObject;
import shape.domain.Triangle;

import java.util.List;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public class TriangleServiceImpl extends AbstractShapeService implements TriangleService {

    @Override
    protected void loadShapes() {
        System.out.println("Loading triangles");
        Integer key = super.getNextKey();
        domainMap.put(key, new Triangle(key, "Triangle1", "Yellow", Boolean.FALSE));
        key = super.getNextKey();
        domainMap.put(key, new Triangle(key, "Triangle2", "Orange", Boolean.TRUE));
    }

    @Override
    public Triangle getShapeById(Integer id) {
        return (Triangle)super.getShapeById(id);
    }

    @Override
    public void addShape(Triangle shape) {
        System.out.println("Adding triangle: " + shape);
        Integer key = getNextKey();
        shape.setId(key);
        domainMap.put(key, shape);
    }

    @Override
    public void showShapes() {
        System.out.println("Showing all triangles: ");
        List<DomainObject> circles = getAllShapes();

        for (DomainObject domainObj : circles) {
            Triangle t = (Triangle)domainObj;
            System.out.println("Triangle " + t.getName() + " with id " + t.getId() + " is right triangle? " + t.isRightTriangle());
        }
    }
}
