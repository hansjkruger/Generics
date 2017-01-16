package shape.domain;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public class Circle implements DomainObject {

    private Integer id;
    private String name;
    private String colour;
    private Integer radius;

    public Circle(){}

    public Circle(Integer id, String name, String colour, Integer radius) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.radius = radius;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", radius=" + radius +
                '}';
    }
}
