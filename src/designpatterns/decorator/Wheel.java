package designpatterns.decorator;

public class Wheel extends CarDecorator {
    public Wheel(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 10000;
    }
}
