package ru.specialist.java.spring.javaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaConfigApp {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        Computer computer = (Computer)ctx.getBean("myComputer");
        System.out.println("CPU: " + computer.getCpu().getVendor());
        System.out.println("Screen: " + computer.getScr().getVendor());
        System.out.println("Memory: " + computer.getMemoryList()
                .stream().map(Device::getVendor).collect(Collectors.joining(", ")));
        System.out.println("Storages: "+  computer.getStorageList().stream().map(Storage::getVendor).collect(Collectors.joining(", ")));

        //System.out.println("Storages: " + computer.getStorageList()
          //      .stream().map(Device::getVendor).collect(Collectors.joining(", ")));
//        System.out.println("Screen: " + computer.getScreen().getVendor());
//        System.out.println("Storage: " + computer.getStorageList()
//                .stream().map(Device::getVendor).collect(Collectors.joining(", ")));

    }

}
