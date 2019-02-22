package de.svo.svoberammergau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class CalendarActivity2 extends AppCompatActivity {

    CalendarView calendarView;
    TextView dateDisplay;
    int day = 0;
    int month = 0;
    int year = 0;
    int[] date = new int [2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar2);



        calendarView = (CalendarView) findViewById(R.id.calendarView);
        dateDisplay = (TextView) findViewById(R.id.date_display);
        dateDisplay.setText("Date: ");

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Date: " + i2 + " / " + i1 + " / " + i);
                Toast.makeText(getApplicationContext(), "Selected Date:\n" + "Day = " + i2 + "\n" + "Month = " + i1 + "\n" + "Year = " + i, Toast.LENGTH_LONG).show();

                day = i2;
                month = i1;
                year = i;
            }

        });


    }

    public void onButtonClick(View v){
        /*date[0] = year;
        date[1] = month;
        date[2] = year;*/
        Intent myIntent = new Intent(getBaseContext(),   NewAppointmentActivity.class);
        myIntent.putExtra("day", day);
        myIntent.putExtra("month", month);
        myIntent.putExtra("year", year);
        startActivity(myIntent);
    }

}
