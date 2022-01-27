package ru.specialist.java.spring.javaconfig;


import java.util.List;

public class Computer {

    private CPU cpu;
    private Screen scr;
    private List<Memory> memoryList;
    private List<Storage> storageList;
//    private Screen screen;
//    private List<Storage> storageList;

    public Computer(){}

    public Computer(CPU cpu){
        this.cpu = cpu;
    }

    public Computer(List<Memory> memoryList) {
        this.memoryList = memoryList;
    }

    public Computer(CPU cpu, List<Memory> memoryList){
        this.cpu = cpu;
        this.memoryList = memoryList;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public List<Memory> getMemoryList() {
        return memoryList;
    }

    public void setMemoryList(List<Memory> memoryList) {
        this.memoryList = memoryList;
    }

    public Screen getScr() {
        return scr;
    }

    public void setScr(Screen scr) {
        this.scr = scr;
    }

    public List<Storage> getStorageList() {
        return storageList;
    }

    public void setStorageList(List<Storage> storageList) {
        this.storageList = storageList;
    }
}
