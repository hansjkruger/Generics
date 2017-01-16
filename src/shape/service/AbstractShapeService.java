package shape.service;

import shape.domain.Circle;
import shape.domain.DomainObject;

import java.util.*;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public abstract class AbstractShapeService {

    protected Map<Integer, DomainObject> domainMap;

    public AbstractShapeService() {
        //System.out.println("Constructing AbstractShapeService");
        domainMap = new HashMap<>();
        loadShapes();
    }

    protected Integer getNextKey(){
        if (domainMap == null) {
            domainMap = new HashMap<>();
        }

        Integer nextKey = 0;
        if (domainMap.size() == 0) {
            nextKey = 1;
        }
        else {
            nextKey = Collections.max(domainMap.keySet()) + 1;
        }

        //System.out.println("Next key will be " + nextKey);
        return nextKey;
    }

    protected abstract void loadShapes();

    public List<DomainObject> getAllShapes() {
        System.out.println("We have " + domainMap.size() + " shapes");
        return new ArrayList<>(domainMap.values());
    }

//    public void addShape(DomainObject shape) {
//        System.out.println("Adding shape: " + shape);
//        Integer key = getNextKey();
//        shape.setId(key);
//        domainMap.put(key, shape);
//    }

    public DomainObject getShapeById(Integer id) {
        return domainMap.get(id);
    }

    public void showShapes() {
        System.out.println("Showing all shapes: ");
        for (DomainObject domainObj : domainMap.values()) {
            System.out.println("Shape (" + domainObj.getId() + ") with name " + domainObj.getName() + " is " + domainObj.getColour());
        }
    }
}
