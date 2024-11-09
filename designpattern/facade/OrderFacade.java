package guru.springframework.spring5webapp.designpattern.facade;

//this will have all the steps to create the order
public class OrderFacade {
    Product product;
    Invoice invoice;
    Payment payment;
    Notification notification;

    public OrderFacade(){
        product=new Product();
        invoice=new Invoice();
        payment=new Payment();
        notification=new Notification();
    }

    public void createOrder(){
        Product product1=product.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
        //order creation successful
    }

}
