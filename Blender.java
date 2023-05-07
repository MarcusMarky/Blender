public class Blender {
    
public Juice blend(Fruit fruit) {
    
Juice juice = new Juice( fruit.getWeight() * fruit.usefull / 100 );

    return juice;
}

}
