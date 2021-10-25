package com.example.a1910team2_0127122_v1;

import java.sql.Time;
import java.sql.Date;

public class LectureTheatre {
    private String id;
    private int capacity;


    public LectureTheatre(){
        this("", 0);
    }

    public LectureTheatre(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void addCapacity(int add){
        this.capacity += add;
    }

    public void reduceCapacity(int reduce){
        this.capacity += reduce;
    }
}
