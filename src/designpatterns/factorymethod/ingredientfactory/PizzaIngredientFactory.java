package designpatterns.factorymethod.ingredientfactory;

import designpatterns.factorymethod.ingredient.cheese.Cheese;
import designpatterns.factorymethod.ingredient.clams.Clams;
import designpatterns.factorymethod.ingredient.dough.Dough;
import designpatterns.factorymethod.ingredient.pepperoni.Pepperoni;
import designpatterns.factorymethod.ingredient.sauce.Sauce;
import designpatterns.factorymethod.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
