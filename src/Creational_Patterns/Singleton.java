package Creational_Patterns;


//Eager Initialization
//    class SingletonEager {
//    private static final SingletonEager instance = new SingletonEager();
//    private SingletonEager(){
//
//    }
//    public static SingletonEager getSingletonEager(){
//        return instance;
//    }
//}

public class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    public Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
