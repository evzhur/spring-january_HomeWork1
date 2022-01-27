package ru.specialist.java.spring.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("myNewComputer")
public class Computer {

    private CPU cpu;
    private List<Memory> memoryList;
    private Screen scr;
    private List<Storage> storageList;

//    private Screen screen;
//    private List<Storage> storageList;


//    @Autowired
//    public Computer(@MyCPU CPU cpu) {
//        this.cpu = cpu;
//    }

    @Autowired
    public Computer(@Qualifier("intelCPU") CPU cpu,
                    @Qualifier("memoryList")List<Memory> memoryList,
                    @Qualifier("myMainScreen") Screen src,
                    @Qualifier("myStorageList") List<Storage> storageList){
        System.out.println("Constructor");
        this.cpu = cpu;
        this.memoryList = memoryList;
        this.scr=src;
        this.storageList=storageList;
    }

//    @Autowired
//    public void setCpu(@Qualifier("intelCPU") CPU cpu) {
//        System.out.println("Setter");
//        this.cpu = cpu;
//    }

    public CPU getCpu() {
        return cpu;
    }

    public List<Memory> getMemoryList() {
        return memoryList;
    }

    public Screen getScr() {
        return scr;
    }

    public List<Storage> getStorageList() {
        return storageList;
    }
}
