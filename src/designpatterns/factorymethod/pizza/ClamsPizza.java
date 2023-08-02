package designpatterns.factorymethod.pizza;

import designpatterns.factorymethod.ingredientfactory.PizzaIngredientFactory;

public class ClamsPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중:" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
