package lab_4;

public class Planets implements Nameable{
    String name;
    int radius;

    public String getName(){
        return name;
    }

    public int getRadius(){
        return radius;
    }

    Planets(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    public void print(){
        System.out.println("Планета: " + name + ", радиус " + radius + " км");
    }
}
