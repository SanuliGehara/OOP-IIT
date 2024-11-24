package lk.sanu.oop;

public class Cat {
    public double height;
    public  double weight;
    public String name;
    public CatType type;

    public Cat(double height, double weight, String name, CatType type) {
        this.setHeight(height);
        this.setWeight(weight);
        this.name = name;
        this.type = type;
    }

    public void setWeight(double weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight can not be less than zero!");
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height can not be less than zero!");
        }
    }

    public double getHeight() {
        return this.height;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public CatType getCatType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
