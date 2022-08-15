package demo3;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 20);
//        System.out.println("Thể tích" + cylinder.getVolume());
        System.out.println("Thể tích" + getCylinderVolume(cylinder));
    }

    public static float getCylinderVolume(Cylinder cyLinder) {
//        Diện tích đáy
        float baseArea = (float) Math.PI * cyLinder.getRadius() * cyLinder.getRadius();
//        Chu vi
        float perimeter = (float) Math.PI * 2 * cyLinder.getRadius();
//        Thể tích
        float volume = perimeter * cyLinder.getHeight() + baseArea * 2;
        return volume;
    }
}
