package org.example;

public class Repositori {
    public String name;
    //public int id;
    public int stargazers_count;
    public String description;

    public Repositori(String name, int stargazers_count, String description){
        this.name = name;
        //this.id = id;
        this.stargazers_count = stargazers_count;
        this.description = description;
    }
}
