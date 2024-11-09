package guru.springframework.spring5webapp.designpattern.facade;

//no change will be there for client as it is calling facade
public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
