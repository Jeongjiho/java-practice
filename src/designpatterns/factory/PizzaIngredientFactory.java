package designpatterns.factory;

import designpatterns.factory.ingredient.cheese.Cheese;
import designpatterns.factory.ingredient.clams.Clams;
import designpatterns.factory.ingredient.dough.Dough;
import designpatterns.factory.ingredient.pepperoni.Pepperoni;
import designpatterns.factory.ingredient.sauce.Sauce;
import designpatterns.factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
