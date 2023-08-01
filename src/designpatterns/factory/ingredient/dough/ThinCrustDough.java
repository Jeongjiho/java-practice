package designpatterns.factory.ingredient.dough;

public class ThinCrustDough implements Dough {
    @Override
    public String print() {
        return "thin crust dough";
    }
}
