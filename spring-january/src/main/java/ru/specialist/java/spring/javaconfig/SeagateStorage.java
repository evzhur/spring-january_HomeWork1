package ru.specialist.java.spring.javaconfig;

public class SeagateStorage implements Storage {
    @Override
    public String getVendor() {
        return " Seagate Storage";
    }
}
