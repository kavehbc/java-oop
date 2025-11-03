package S18_interface;

public class Data {
    
    public static double average(Object[] objects, Measurer measurer) {
        if (objects == null || objects.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        
        double sum = 0;
        for (Object obj : objects) {
            sum += measurer.measure(obj);
        }
        
        return sum / objects.length;
    }
}
