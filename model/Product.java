package guru.springframework.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Product {

    @Id
    private int productId;
    private String name;

    public Product() {
    }

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sell() {
        return "I am selling the product";
       // System.out.println("I am selling the product");
    }

    public void call(){
        System.out.println("How did you call me ??");
    }

    private static  void staticMethod(){
        System.out.println("Hi I am static method !");
    }
}
