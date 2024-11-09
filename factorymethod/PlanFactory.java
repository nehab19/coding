package guru.springframework.spring5webapp.factorymethod;

public class PlanFactory {
        public Plan getPlan(String planType){
            if(planType==null){
                return null;
            }
            else if(planType.equalsIgnoreCase("domestic")){
                return new DomesticPlan();
            }else if(planType.equalsIgnoreCase("commercial")){
                return new CommercialPlan();
            }
            return null;
        }
}
