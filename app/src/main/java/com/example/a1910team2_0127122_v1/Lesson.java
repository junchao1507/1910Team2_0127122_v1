package com.example.a1910team2_0127122_v1;
//import java.util.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Lesson {
    private static ArrayList<Lesson> lessonList = new ArrayList<>();

    private int lessonId;
    private String lessonDescription;
    private Date date;
    private Date time;
    private int durationHrs;
    private int classId;

    public Lesson(){
        this(0, "", null, null, 0, 0);
    }

    public Lesson(int lessonId, String lessonDescription, Date date, Date time, int durationHrs, int classId){
        this.lessonId = lessonId;
        this.lessonDescription = lessonDescription;
        this.date = date;
        this.time = time;
        this.durationHrs = durationHrs;
        this.classId = classId;
    }

    public int getLessonId(){
        return lessonId;
    }

    public void setLessonId(int lectureId){
        this.lessonId = lessonId;
    }

    public String getLessonDescription(){
        return lessonDescription;
    }

    public void setLessonDescription(String lessonDescription){
        this.lessonDescription = lessonDescription;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getTime(){
        return time;
    }

    public void setTime(Date time){
        this.time = time;
    }

    public int getDurationHrs(){
        return durationHrs;
    }

    public void setDurationHrs(int durationHrs){
        this.durationHrs = durationHrs;
    }

    public int getClassId(){
        return classId;
    }

    public void setClassId(int classId){
        this.classId = classId;
    }

    public static void initLessons(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        Date lessonDate, lessonTime;

        try {
            lessonDate = (Date) dateFormatter.parse("17-Jan-2022");
            lessonTime = (Date) timeFormatter.parse("10:00");

            lessonList.add(new Lesson(
                    1,
                    "Lecture",
                    lessonDate,
                    lessonTime,
                    2,
                    1
            ));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            lessonDate = (Date) dateFormatter.parse("18-Jan-2022");
            lessonTime = (Date) timeFormatter.parse("10:00");

            lessonList.add(new Lesson(
                    2,
                    "Tutorial",
                    lessonDate,
                    lessonTime,
                    2,
                    1
            ));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
