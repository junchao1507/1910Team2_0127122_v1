package com.example.a1910team2_0127122_v1;
import java.sql.Time;
import java.sql.Date;

public class Lecture {
    private int lectureId;
    private Date date;
    private Time time;
    private int classId;

    public Lecture(){
        this(0, null, null, 0);
    }

    public Lecture(int lectureId, Date date, Time time, int classId){
        this.lectureId = lectureId;
        this.date = date;
        this.time = time;
        this.classId = classId;
    }

    public int getLectureId(){
        return lectureId;
    }

    public void setCLectureId(int lectureId){
        this.lectureId = lectureId;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public int getClassId(){
        return classId;
    }

    public void setClassId(int classId){
        this.classId = classId;
    }
}
