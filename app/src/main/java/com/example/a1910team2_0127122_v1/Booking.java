package com.example.a1910team2_0127122_v1;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Calendar;


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