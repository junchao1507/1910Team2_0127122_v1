package com.example.a1910team2_0127122_v1;

import java.sql.Date;

public class Subject {
    private int classId;
    private String subjectCode;
    private String subjectName;
    private String subjectLecturer;
    private String lectureDay;
    private String tutorialDay;
    private Date firstClass;
    private Date lastClass;
    private int numOfStud;

    public Subject(){
        this(0, "", "", "", "", "", null, null, 0);
    }

    public Subject(int classId, String subjectCode, String subjectName, String subjectLecturer, String lectureDay, String tutorialDay, Date firstClass, Date lastClass, int numOfStud){
        this.classId = classId;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectLecturer = subjectLecturer;
        this.lectureDay = lectureDay;
        this.tutorialDay = tutorialDay;
        this.firstClass = firstClass;
        this.lastClass = lastClass;
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

    public void setTutorialDay(String tutorialDay){
        this.tutorialDay = tutorialDay;
    }

    public Date getFirstClass(){
        return firstClass;
    }

    public void setFirstClass(Date firstClass){
        this.firstClass = firstClass;
    }

    public Date getLastClass(){
        return lastClass;
    }

    public void setLastClass(Date lastClass){
        this.lastClass = lastClass;
    }

    public int getNumOfStud(){
        return numOfStud;
    }

    public void setNumOfStud(int numOfStud){
        this.numOfStud = numOfStud;
    }
}
