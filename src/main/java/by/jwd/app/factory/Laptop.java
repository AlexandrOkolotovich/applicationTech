package by.jwd.app.factory;

import java.util.Objects;

public class Laptop implements Technics {
    private float battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private float cpy;
    private int display_inchs;

    public Laptop(float battery_capacity, String os, int memory_rom, int system_memory, float cpy, int display_inchs) {
        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.cpy = cpy;
        this.display_inchs = display_inchs;
    }

    public Laptop() {
    }

    public float getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(float battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getSystem_memory() {
        return system_memory;
    }

    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }

    public float getCpy() {
        return cpy;
    }

    public void setCpy(float cpy) {
        this.cpy = cpy;
    }

    public int getDisplay_inchs() {
        return display_inchs;
    }

    public void setDisplay_inchs(int display_inchs) {
        this.display_inchs = display_inchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Float.compare(laptop.battery_capacity, battery_capacity) == 0 &&
                memory_rom == laptop.memory_rom &&
                system_memory == laptop.system_memory &&
                Float.compare(laptop.cpy, cpy) == 0 &&
                display_inchs == laptop.display_inchs &&
                Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, os, memory_rom, system_memory, cpy, display_inchs);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", cpy=" + cpy +
                ", display_inchs=" + display_inchs +
                '}';
    }

    @Override
    public void setTechnicalSpecifications() {

    }
}
