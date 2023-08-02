package designpatterns.factorymethod.ingredientfactory;

import designpatterns.factorymethod.ingredient.cheese.Cheese;
import designpatterns.factorymethod.ingredient.cheese.ReggianoCheese;
import designpatterns.factorymethod.ingredient.clams.Clams;
import designpatterns.factorymethod.ingredient.clams.FreshClams;
import designpatterns.factorymethod.ingredient.dough.Dough;
import designpatterns.factorymethod.ingredient.dough.ThinCrustDough;
import designpatterns.factorymethod.ingredient.pepperoni.Pepperoni;
import designpatterns.factorymethod.ingredient.pepperoni.SlicedPepperoni;
import designpatterns.factorymethod.ingredient.sauce.MarinaraSauce;
import designpatterns.factorymethod.ingredient.sauce.Sauce;
import designpatterns.factorymethod.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
