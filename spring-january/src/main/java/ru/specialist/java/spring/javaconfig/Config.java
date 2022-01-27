package ru.specialist.java.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class Config {

    @Bean("myComputer")
    public Computer computer(){
        Computer c = new Computer();
        c.setCpu(intel());
        c.setScr(sumsungScreen());
        c.setMemoryList(List.of(sony(), kingston(), sony()));
        c.setStorageList(List.of(seagateStorage(), hpStorage(), hpStorage()));
//        c.setMemoryList(memoryList());
        return c;
    }

    @Bean
    public CPU intel(){
        return new IntelCPU();
    }

    @Bean
    public CPU amd(){
        return new AmdCPU();
    }

    @Bean
    public Screen sumsungScreen(){
        return new SumsungScreen();
    }

    @Bean
    public  Screen dellScreen(){
        return new DellScreen();
    }

    @Bean
    @Scope("prototype")
    public Memory sony(){
        return new SonyMemory();
    }

    @Bean
    public Memory kingston(){
        return new KingstonMemory();
    }

    @Bean
    @Scope("prototype")
    public Storage seagateStorage(){return new SeagateStorage();}

    @Bean
    @Scope("prototype")
    public Storage hpStorage(){return new HPStorage();}


//    @Bean
//    public List<Memory> memoryList(){
//        return List.of(new SonyMemory(), new KingstonMemory());
//    }
}
