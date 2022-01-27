package ru.specialist.java.spring.javaconfig;

public class HPStorage implements Storage {
    @Override
    public String getVendor() {
        return " HP Storage /hash:" +this.hashCode();
    }
}
