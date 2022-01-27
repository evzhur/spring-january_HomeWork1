package ru.specialist.java.spring.annotation;

import org.springframework.stereotype.Component;

@Component("myMainScreen")
public class DellScreen implements Screen{
    @Override
    public String getVendor() {
        return "Dell Screen";
    }
}
