package com.example.a1910team2_0127122_v1;

import java.sql.Time;
import java.sql.Date;
import java.util.ArrayList;

public class LectureTheatre {
    private static ArrayList<LectureTheatre> theatreList = new ArrayList<>();

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

    public static void initTheatres(){
        theatreList.add(new LectureTheatre("GF-LTR-01", 100));
        theatreList.add(new LectureTheatre("GF-LTR-02", 100));
    }

    public static ArrayList<LectureTheatre> getTheatreList()
    {
        return theatreList;
    }
}
