public class App {
   public static void main(String[] args) {
    
Blender portableBlender = new Blender();

Fruit apple    = new Apple(200);

Fruit orange   = new Orange(500);

Fruit banana = new Banana(100);

Fruit orangeApple = new OrangeApple(600);

apple.printVitamins();
orange.printVitamins();
banana.printVitamins();
orangeApple.printVitamins();

} 
}
