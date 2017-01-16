package shape.domain;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public interface DomainObject {

    Integer getId();
    void setId(Integer id);
    String getName();
    void setName(String name);
    String getColour();
    void setColour(String colour);

}
