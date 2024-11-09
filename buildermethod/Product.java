package guru.springframework.spring5webapp.buildermethod;

public class Product {
    private final String name;
    private final double price;
    private final String description;
    private final int quantity;
    private final boolean inStock;


    Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.quantity = builder.quantity;
        this.inStock = builder.inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", inStock=" + inStock +
                '}';
    }

    public static class  Builder{
        private String name;
        private double price;
        private String description;
        private int quantity;
        private boolean inStock;

        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setPrice(Double price){
            this.price=price;
            return this;
        }
        public Builder setDescription(String description){
            this.description=description;
            return this;
        }
        public Builder setQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public Builder setInStock(boolean inStock){
            this.inStock=inStock;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }

}
