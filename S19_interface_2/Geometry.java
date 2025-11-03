package S19_interface_2;

public interface Geometry {
    double area();
    double perimeter();

    static double totalArea(Geometry[] shapes) {
        double total = 0;
        for (Geometry shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}
