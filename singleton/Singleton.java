package guru.springframework.spring5webapp.singleton;

/* a java singleton class is a class that can have only one object (an instance of the class) at a time.
After the first time, if we try to instantiate the Java Singleton classes, the new variable also points
 to the first instance created. So whatever modifications we do to any variable inside the class through
 any instance, affects the variable of the single instance created and is visible
 if we access that variable through any variable of that class type defined.
 */
public class Singleton {

    private static Singleton single_instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (single_instance == null) {
            synchronized (Singleton.class) {
                if (single_instance == null) {
                    single_instance = new Singleton();
                }
            }
        }
        return single_instance;
    }
}