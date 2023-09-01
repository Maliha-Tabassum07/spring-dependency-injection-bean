package com.example.dependencyinject;


import org.springframework.context.annotation.Bean;

public class Movies {

    private String name;
    private String genre;

    public Movies(String name, String genre){
        System.out.println("Movie You want to see is");
        this.name=name;
        this.genre=genre;


    }
    @Bean
    public String getName(){
        return  this.name;

    }

    @Bean
    public String getGenre(){
        return this.genre;
    }

}
