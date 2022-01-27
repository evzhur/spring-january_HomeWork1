package ru.specialist.java.spring.annotation;

import org.springframework.stereotype.Component;

@Component
@MyCPU
public class IntelCPU implements CPU {

    @Override
    public String getVendor() {
        return "Intel";
    }

}
