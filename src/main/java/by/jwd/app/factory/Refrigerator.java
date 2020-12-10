package by.jwd.app.factory;

import java.util.Objects;

public class Refrigerator implements Technics {
    private int power_consumption;
    private float weight;
    private float freezer_capacity;
    private float overal_capacity;
    private float height;
    private float width;

    public Refrigerator(int power_consumption, float weight, float freezer_capacity, float overal_capacity, float height, float width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overal_capacity = overal_capacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator() {
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

    public float getFreezer_capacity() {
        return freezer_capacity;
    }

    public void setFreezer_capacity(float freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public float getOveral_capacity() {
        return overal_capacity;
    }

    public void setOveral_capacity(float overal_capacity) {
        this.overal_capacity = overal_capacity;
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
        Refrigerator that = (Refrigerator) o;
        return power_consumption == that.power_consumption &&
                Float.compare(that.weight, weight) == 0 &&
                Float.compare(that.freezer_capacity, freezer_capacity) == 0 &&
                Float.compare(that.overal_capacity, overal_capacity) == 0 &&
                Float.compare(that.height, height) == 0 &&
                Float.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, weight, freezer_capacity, overal_capacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", freezer_capacity=" + freezer_capacity +
                ", overal_capacity=" + overal_capacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public void setTechnicalSpecifications() {

    }
}
