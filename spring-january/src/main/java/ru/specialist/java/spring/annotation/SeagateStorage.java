package ru.specialist.java.spring.annotation;

public class SeagateStorage implements Storage{
    @Override
    public String getVendor() {
        return " Seagate Storage";
    }
}
