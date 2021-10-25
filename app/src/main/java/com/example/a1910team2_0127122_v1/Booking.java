package com.example.a1910team2_0127122_v1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Booking extends AppCompatActivity {
    DatePickerDialog datePicker;
    TimePickerDialog timePicker;
    Calendar c;
    EditText date, time, theatre;
    ArrayList<LectureTheatre> theatreList = new ArrayList<>();
    ArrayList<Lecture> lectureList = new ArrayList<>();
    ArrayList<Subject> subjectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        date = (EditText) findViewById(R.id.edt_inputDate);
        time = (EditText) findViewById(R.id.edt_inputTime);
        theatre = (EditText) findViewById(R.id.edt_iinputLectureTheatre);

        // Adding a list of lecture theatres
        theatreList.add(new LectureTheatre("GF-LTR-01", 100));
        theatreList.add(new LectureTheatre("GF-LTR-02", 100));
        theatreList.add(new LectureTheatre("GF-LTR-03", 100));
        theatreList.add(new LectureTheatre("GF-LTR-04", 100));

        // Adding a list of subjects
        subjectList.add(new Subject(
                1,
                "XBMC3014",
                "Internet & Web Development",
                "Dr. Law Foong Li",
                "TUESDAY",
                "WEDNESDAY",
                new Date())

        // Adding a list of lectures

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
    }
}