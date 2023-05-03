public class App {
   public static void main(String[] args) {
    
Blender portableBlender = new Blender();

Fruit smallApple  = new Apple( 50);
Fruit bigApple    = new Apple(200);

Fruit smallOrange = new Orange(30);
Fruit bigOrange   = new Orange(500);

Fruit banana = new Banana(100);

Juice smallAppleJuice = portableBlender.blend(smallApple);
System.out.println(smallAppleJuice.volume);

Juice bigAppleJuice = portableBlender.blend(bigApple);
System.out.println(bigAppleJuice.volume);

   
   
} 
}
