package Creational_Patterns.factory_design;

public class FactoryDesign {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza(PizzaType.Paneer);
        pizza.name();
    }
}

enum PizzaType{
    Margerita,
    Veggie,
    Paneer
}

class PizzaFactory{
    public Pizza getPizza(PizzaType type){
        switch (type){
            case Margerita:
                return new Margerita();
            case Veggie:
                return new Veggie();
            case Paneer:
                return new Paneer();
            default :
                throw new RuntimeException("Pizza not available");
        }
    }
}

interface Pizza{
    void name();
}

class Margerita implements Pizza{

    @Override
    public void name() {
        System.out.println("Margerita Pizza");
    }
}

class Veggie implements Pizza{

    @Override
    public void name() {
        System.out.println("Veggie Pizza");
    }
}

class Paneer implements Pizza{

    @Override
    public void name() {
        System.out.println("Paneer pizza");
    }
}

