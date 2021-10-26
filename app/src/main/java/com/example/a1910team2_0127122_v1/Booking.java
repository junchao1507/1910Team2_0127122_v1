package com.example.a1910team2_0127122_v1;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;
//import java.util.Time;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Booking extends AppCompatActivity {
    DatePickerDialog datePicker;
    TimePickerDialog timePicker;
    Calendar c;
    EditText date, time, seat;
    AutoCompleteTextView theatre;
    ArrayList<LectureTheatre> theatreList = new ArrayList<>();
    ArrayList<Lesson> lessonList = new ArrayList<>();
    ArrayList<Subject> subjectList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        date = (EditText) findViewById(R.id.edt_inputDate);
        time = (EditText) findViewById(R.id.edt_inputTime);
        theatre = (AutoCompleteTextView) findViewById(R.id.actv_inputLectureTheatre);
        seat = (EditText) findViewById(R.id.edt_inputSeat);

//        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");
//        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");

//        // Adding a list of lecture theatres
//        theatreList.add(new LectureTheatre("GF-LTR-01", 100));
//        theatreList.add(new LectureTheatre("GF-LTR-02", 100));

//        // Adding a list of subjects
//        Date startDate, endDate;
//        try {
//            startDate = (Date) dateFormatter.parse("17-Jan-2022");
//            endDate = (Date) dateFormatter.parse("15-Apr-2022");
//
//            subjectList.add(new Subject(
//                    1,
//                    "XBMC3014",
//                    "Internet & Web Development",
//                    "Dr. Law Foong Li",
//                    "MONDAY",
//                    "TUESDAY",
//                    startDate,
//                    endDate,
//                    30));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


//        // Adding a list of lessons (lectures + tutorials)
//        Date lessonDate, lessonTime;
//        try {
//            lessonDate = (Date) dateFormatter.parse("17-Jan-2022");
//            lessonTime = (Date) timeFormatter.parse("10:00");
//
//            lessonList.add(new Lesson(
//                    1,
//                    "Lecture",
//                    lessonDate,
//                    lessonTime,
//                    2,
//                    1
//            ));
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            lessonDate = (Date) dateFormatter.parse("18-Jan-2022");
//            lessonTime = (Date) timeFormatter.parse("10:00");
//
//            lessonList.add(new Lesson(
//                    2,
//                    "Tutorial",
//                    lessonDate,
//                    lessonTime,
//                    2,
//                    1
//            ));
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


        date.setInputType(InputType.TYPE_NULL);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONDAY);
                int year = c.get(Calendar.YEAR);

                datePicker = new DatePickerDialog(Booking.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                datePicker.show();
            }
        });


        time.setInputType(InputType.TYPE_NULL);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int min = c.get(Calendar.MINUTE);

                timePicker = new TimePickerDialog(Booking.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minutes) {
                                String amPm = "";
                                if (hourOfDay >= 12) {
                                    amPm = "PM";
                                } else {
                                    amPm = "AM";
                                }
                                time.setText(String.format("%02d:%02d", hourOfDay, minutes) + amPm);
                            }
                        }, hour, min, false);
                timePicker.show();
            }
        });

        LectureTheatre.initTheatres();
        TheatreAdapter adapter = new TheatreAdapter(this, R.layout.theatre_dropdown_adapter, LectureTheatre.getTheatreList());
        theatre.setAdapter(adapter);
    }
}