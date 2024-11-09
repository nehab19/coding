package guru.springframework.spring5webapp.anonymous;


@FunctionalInterface
interface Age{
       int x=22;
    void getAge();
}

/** Instead of need of Myclass we can directly implement getAge in psvm that way it is called anonymous class **/
class MyClass implements  Age{

    @Override
    public void getAge() {
        System.out.println("My age in MyClass is : " +x);

    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        /** x in anonymous class can be accessed but in case of lamda it needs to call AGE.x **/
        /**Anonymous Inner Class: The x variable is accessible directly within an anonymous inner class because the anonymous
         * class can access all members of the interface, including static fields.
         Lambda Expression: You need to explicitly qualify the static field x with the interface name (Age.x)
         in a lambda expression because the lambda expression does not automatically have access to static members of an interface. **/
        Age age=()-> System.out.println("My age is "+Age.x);
      /* Age age=new Age() {
           @Override
           public void getAge() {
               System.out.println("My age is : "+x);
           }
       };*/
       age.getAge();

    }
}
