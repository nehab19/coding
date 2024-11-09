package guru.springframework.spring5webapp.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        /** getInstance is made static as because staticmethods do not allow objects to be called **/
        Singleton object1= Singleton.getInstance();
        Singleton object2= Singleton.getInstance();
        Singleton object3= Singleton.getInstance();
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object3.hashCode());
        System.out.println(object1.equals(object2));

    }
}
