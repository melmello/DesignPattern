package AbstractFactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
