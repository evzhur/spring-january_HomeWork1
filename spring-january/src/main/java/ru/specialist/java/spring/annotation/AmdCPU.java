package ru.specialist.java.spring.annotation;

import org.springframework.stereotype.Component;

@Component("myAmdCpu")
public class AmdCPU implements CPU {
    @Override
    public String getVendor() {
        return "AMD";
    }
}
