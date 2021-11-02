package com.example.a1910team2_0127122_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        setContentView(R.layout.activity_main);

        List<MenuItem> itemList = new ArrayList<>();
        itemList.add(new MenuItem(R.drawable.screening, "Covid Risk Status"));
        itemList.add(new MenuItem(R.drawable.booking, "Book a Seat"));
        itemList.add(new MenuItem(R.drawable.revision, "Revise"));
        itemList.add(new MenuItem(R.drawable.quiz, "Quiz"));
        itemList.add(new MenuItem(R.drawable.report, "Report"));
        itemList.add(new MenuItem(R.drawable.history, "History"));

        ImageView imgProfile = (ImageView) findViewById(R.id.imv_profile);
        GridView gridView = findViewById(R.id.gv_menu);
        MenuAdapter menuAdapter = new MenuAdapter(this, R.layout.menu_item, itemList);
        gridView.setAdapter(menuAdapter);


        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                Intent intent;

                intent = new Intent(context, Profile.class);
                startActivity(intent);
            }
        });


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Context context = MainActivity.this;
                Intent intent;

                switch(position)
                {
                    case 0:
                        intent =  new Intent(context, UpdateCovidStatus.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent =  new Intent(context, Booking.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent =  new Intent(context, Revision.class);
                        startActivity(intent);
                        break;

                    case 3:
                        intent =  new Intent(context, Quiz.class);
                        startActivity(intent);
                        break;

                    case 4:
                        intent =  new Intent(context, Report.class);
                        startActivity(intent);
                        break;

                    case 5:
                        intent =  new Intent(context, History.class);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }
            }
        });



    }


}