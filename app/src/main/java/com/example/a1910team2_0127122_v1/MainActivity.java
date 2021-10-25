package com.example.a1910team2_0127122_v1;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        setContentView(R.layout.activity_main);

        List<MenuItem> itemList = new ArrayList<>();
        itemList.add(new MenuItem(R.drawable.screening, "Update Risk Status"));
        itemList.add(new MenuItem(R.drawable.booking, "Booking"));
        itemList.add(new MenuItem(R.drawable.learning, "Revise"));
        itemList.add(new MenuItem(R.drawable.quiz, "Quiz"));
        itemList.add(new MenuItem(R.drawable.report, "Report"));
        itemList.add(new MenuItem(R.drawable.history, "History"));

        GridView gridView = findViewById(R.id.gv_menu);
        MenuAdapter menuAdapter = new MenuAdapter(this, R.layout.menu_item, itemList);
        gridView.setAdapter(menuAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Context context = MainActivity.this;
                Intent intent;

                switch(position)
                {
                    case 0:
                        intent =  new Intent(context, UpdateRiskStatus.class);
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