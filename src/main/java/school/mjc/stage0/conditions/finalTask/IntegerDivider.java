package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
     dividend=4;
     divider=0;
     if(dividend==0 || divider==0){
       System.out.println("division by zero");  
     }else{
       int quotient=dividend/divider;
       if(quotient*divider==dividend){
        System.out.println("can be divided completely");
       }else{
        System.out.println("cannot be divided completely");} 
     } 
    }
}
