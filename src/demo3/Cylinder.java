package demo3;

public class Cylinder {
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
//    Bỏ static và không cần truyền tham số và thay bằng this
//    Tách diện tích đáy và chu vi
}
