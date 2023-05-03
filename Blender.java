public class Blender {
    
public Juice blend(Fruit fruit) {
    
Juice juice = new Juice( fruit.weight * fruit.usefull / 100 );

    return juice;
}

}
