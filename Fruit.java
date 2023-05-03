abstract public class Fruit {
//HW2: Eroarea de scriere a codului a fost faptul ca, fiind static, proprietatea ,,usefull'' se scrie cu caractere mari.
 int usefull = 0;

public int weight;

public Fruit(){}

public Fruit(int weight) {
this.weight = weight;
}
abstract public void printVitamins();

}
