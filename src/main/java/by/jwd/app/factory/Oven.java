package by.jwd.app.factory;

import java.util.Objects;

public class Oven implements Technics {
    private int power_consumption;
    private float weight;
    private float capacity;
    private float depth;
    private float height;
    private float width;

    public Oven(int power_consumption, float weight, float capacity, float depth, float height, float width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven() {
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return power_consumption == oven.power_consumption &&
                Float.compare(oven.weight, weight) == 0 &&
                Float.compare(oven.capacity, capacity) == 0 &&
                Float.compare(oven.depth, depth) == 0 &&
                Float.compare(oven.height, height) == 0 &&
                Float.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public void setTechnicalSpecifications() {

    }
}
