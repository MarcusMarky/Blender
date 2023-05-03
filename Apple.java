public class Apple extends Fruit {
    
    public Apple (int weight){
        
        super(weight);
        usefull = 80;
        //HW1: o alternativa este: this(weight)
    }
    public void printVitamins(){
        System.out.println("B-Complex");
    }
}
