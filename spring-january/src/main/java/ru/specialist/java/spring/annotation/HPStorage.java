package ru.specialist.java.spring.annotation;

public class HPStorage implements Storage{
    private String strID = null;
    @Override
    public String getVendor() {
        return " Seagate Storage ID:" + strID.toString();
    }

    public HPStorage(String str) {
        strID=str;
    }
}
