package shape.domain;

/**
 * Created by hans.kruger on 2017/01/16.
 */
public class Triangle implements DomainObject {
    private Integer id;
    private String name;
    private String colour;
    private Boolean isRightTriangle;

    public Triangle() {}

    public Triangle(Integer id, String name, String colour, Boolean isRightTriangle) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.isRightTriangle = isRightTriangle;
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

    public Boolean isRightTriangle() {
        return isRightTriangle;
    }

    public void setRightTriangle(Boolean isRightTriangle) {
        this.isRightTriangle = isRightTriangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", isRightTriangle=" + isRightTriangle +
                '}';
    }
}
