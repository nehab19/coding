package guru.springframework.spring5webapp.buildermethod;

import guru.springframework.spring5webapp.singleton.Singleton;

public class MainMethod  {
    public static void main(String[] args) {

        Product product= new Product.Builder().setName("Neha").setDescription("hello")
                .setPrice(12d).setInStock(true).setQuantity(12).build();
        System.out.println(product);
    }

}
