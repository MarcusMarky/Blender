abstract public class Fruit {
//HW2: Eroarea de scriere a codului a fost faptul ca, fiind static, proprietatea ,,usefull'' se scrie cu caractere mari.
 int usefull = 0;

private int weight;

public int getWeight() {
    return weight;
}

public void setWeight(int weight) {
    this.weight = weight;
}

public Fruit(){}

public Fruit(int weight) {
this.weight = weight;
}
abstract public void printVitamins();

}
