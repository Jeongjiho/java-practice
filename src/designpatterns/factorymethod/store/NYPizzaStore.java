package designpatterns.factorymethod.store;

import designpatterns.factorymethod.ingredientfactory.NYPizzaIngredientFactory;
import designpatterns.factorymethod.ingredientfactory.PizzaIngredientFactory;
import designpatterns.factorymethod.menu.Menu;
import designpatterns.factorymethod.pizza.CheesePizza;
import designpatterns.factorymethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(Menu.CHEESE.getMenu().equals(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        }
        else if(Menu.VEGGIE.getMenu().equals(item)) {
            // TODO 여기부터 해야 함.
            //pizza = new Veggi
        }
    }
}
