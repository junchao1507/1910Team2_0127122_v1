package com.example.a1910team2_0127122_v1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Subject {
    private static ArrayList<Subject> subjectList = new ArrayList<>();

    private int classId;
    private String subjectCode;
    private String subjectName;
    private String subjectLecturer;
    private String lectureDay;
//    private Date lectureTime;
//    private int lectureDuration;
    private String tutorialDay;
//    private Date tutorialTime;
//    private int tutorialDuration;
    private Date firstClassDate;
    private Date lastClassDate;
    private int numOfStud;

    public Subject(){
        this(0, "", "", "", "", "",  null, null, 0);
    }

    public Subject(int classId, String subjectCode, String subjectName, String subjectLecturer, String lectureDay,  String tutorialDay, Date firstClassDate, Date lastClassDate, int numOfStud){
        this.classId = classId;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectLecturer = subjectLecturer;
        this.lectureDay = lectureDay;
//        this.lectureTime = lectureTime;
//        this.lectureDuration = lectureDuration;
        this.tutorialDay = tutorialDay;
//        this.tutorialTime = tutorialTime;
//        this.tutorialDuration = tutorialDuration;
        this.firstClassDate = firstClassDate;
        this.lastClassDate= lastClassDate;
        this.numOfStud = numOfStud;
    }

    public int getClassId(){
        return classId;
    }

    public void setClassId(int classId){
        this.classId = classId;
    }

    public String getSubjectCode(){
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode){
        this.subjectCode = subjectCode;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectLecturer(){
        return subjectLecturer;
    }

    public void setSubjectLecturer(String subjectLecturer){
        this.subjectLecturer = subjectLecturer;
    }

    public String getLectureDay(){
        return lectureDay;
    }

//    public Date getLectureTime(){
//        return lectureTime;
//    }
//
//    public void setLectureTime(Date lectureTime){
//        this.lectureTime = lectureTime;
//    }
//
//    public int getLectureDuration(){
//        return lectureDuration;
//    }
//
//    public void setLectureDuration(int lectureDuration){
//        this.lectureDuration = lectureDuration;
//    }

    public String getTutorialDay(){
        return tutorialDay;
    }

    public void setTutorialDay(String tutorialDay){
        this.tutorialDay = tutorialDay;
    }

//    public Date getTutorialTime(){
//        return tutorialTime;
//    }
//
//    public int getTutorialDuration(){
//        return tutorialDuration;
//    }
//
//    public void setTutorialDuration(int tutorialDuration){
//        this.tutorialDuration = tutorialDuration;
//    }
//
//    public void setTutorialTime(Date tutorialTime){
//        this.tutorialTime = tutorialTime;
//    }

    public Date getFirstClassDate(){
        return firstClassDate;
    }

    public void setFirstClassDate(Date firstClassDate){
        this.firstClassDate = firstClassDate;
    }

    public Date getLastClassDate(){
        return lastClassDate;
    }

    public void setLastClassDate(Date lastClassDate){
        this.lastClassDate = lastClassDate;
    }

    public int getNumOfStud(){
        return numOfStud;
    }

    public void setNumOfStud(int numOfStud){
        this.numOfStud = numOfStud;
    }

    public static void initSubjects()
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        Date startDate, endDate;

        try {
            startDate = (Date) dateFormatter.parse("17-Jan-2022");
            endDate = (Date) dateFormatter.parse("15-Apr-2022");

            subjectList.add(new Subject(
                    1,
                    "XBMC3014",
                    "Internet & Web Development",
                    "Dr. Law Foong Li",
                    "MONDAY",
                    "TUESDAY",
                    startDate,
                    endDate,
                    30));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
