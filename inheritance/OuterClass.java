package guru.springframework.spring5webapp.inheritance;

public class OuterClass {
    private int outerField = 10;

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            // Cannot access outerField directly
            System.out.println("Inside static nested class");
        }
    }

    // Non-static inner class
    public class InnerClass {
        public void display() {
            // Can access outerField directly
            System.out.println("Inside inner class, outerField: " + outerField);
        }
    }

    public static void main(String[] args) {
        // Instantiate the static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();  // Output: Inside static nested class

        // Instantiate the outer class
        OuterClass outer = new OuterClass();

        // Instantiate the non-static inner class
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();  // Output: Inside inner class, outerField: 10
    }
}
