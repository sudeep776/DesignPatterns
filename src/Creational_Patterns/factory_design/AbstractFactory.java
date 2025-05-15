package Creational_Patterns.factory_design;

public class AbstractFactory {
    public static void main(String[] args) {
        BurgerFactory mcdFactory = BurgerFactoryProducer.getBurgerFactory("McDonalds");
        burger McVeg = mcdFactory.getBurger(BurgerType.McVeggie);
        McVeg.name();
    }
}

interface burger {
    void name();
}

enum BurgerType{
    McAlooTikki,
    McVeggie,
    Maharaja,
    Zinger
}

class BurgerFactoryProducer{
    public static BurgerFactory getBurgerFactory(String brand){
        if(brand.equals("McDonalds")){
            return new McDonaldsFactory();
        } else if (brand.equals("KfcFactory")) {
            return new KfcFactory();
        }
        throw new IllegalArgumentException("Unknown brand : "+brand);
    }
}

interface BurgerFactory{
    burger getBurger(BurgerType type);
}

class McDonaldsFactory implements BurgerFactory{
    public burger getBurger(BurgerType type){
        switch (type){
            case McAlooTikki:
                return new McAlooTikki();
            case McVeggie:
                return new McVeggie();
            default :
                throw new RuntimeException("No burger type");
        }
    }
}

class KfcFactory implements BurgerFactory{
    public burger getBurger(BurgerType type){
        switch (type){
            case Maharaja :
                return new Maharaja();
            case Zinger:
                return new Zinger();
            default:
                throw new RuntimeException("No burger type");
        }
    }
}


class McAlooTikki implements burger{

    @Override
    public void name() {
        System.out.println("Mcaloo tikki burger");
    }
}

class McVeggie implements burger{

    @Override
    public void name() {
        System.out.println("McVeggie burger");
    }
}

class Maharaja implements burger{

    @Override
    public void name() {
        System.out.println("Mahraja kfc burger");
    }
}

class Zinger implements burger{

    @Override
    public void name() {
        System.out.println("Zinger burger");
    }
}


