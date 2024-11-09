package guru.springframework.spring5webapp.factorymethod;



    abstract class  Plan{
        public double rate=0d;
        public abstract void getInterestRate();
        public void calculateBill(int units){
            System.out.println(units*rate);
        }
    }

    class DomesticPlan extends Plan{
        @Override
        public void getInterestRate() {
            rate=3.6;
            System.out.println("Domestic Plan");
        }
    }

    class CommercialPlan extends Plan{
        @Override
        public void getInterestRate() {
            rate=8.0;
            System.out.println("Commercial Plan");
        }
    }
