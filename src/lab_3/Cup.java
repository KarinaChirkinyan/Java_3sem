package lab_3;

public class Cup extends Dish{
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cup(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Чашка: объем " + size + ", материал " + material + ", цвет " + color;
    }
}
