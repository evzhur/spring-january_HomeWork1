package ru.specialist.java.spring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan("ru.specialist.java.spring.annotation")
public class Config {

    @Bean
    public List<Memory> memoryList(){
        return List.of(new SonyMemory(), new KingstonMemory(), new SonyMemory());
    }

    @Bean
    @Qualifier("myStorageList")
    public List<Storage> storageList() { return  List.of(new SeagateStorage(), new HPStorage("1"), new HPStorage("2"));}
}
