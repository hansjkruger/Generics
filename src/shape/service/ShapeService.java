package shape.service;

import java.util.List;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public interface ShapeService<T> {

    List getAllShapes();
    T getShapeById(Integer id);
    void addShape(T shape);
    void showShapes();

}
