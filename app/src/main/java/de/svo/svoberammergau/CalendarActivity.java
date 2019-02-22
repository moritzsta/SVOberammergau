package de.svo.svoberammergau;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }


    /*long eventOccursOn;
    eventOccursOnView.setOnDateChangeListener(new OnDateChangeListener() {
        //show the selected date as a toast
        @Override
        public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
            Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            Calendar c = new Calendar.getInstance();
            c.set(year, month, day);
            eventOccursOn=  c.getTimeInMillis(); //this is what you want to use later
        }
    });*/

    public void onClick(View v){
        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView); // get the reference of CalendarView
        long selectedDate = calendarView.getDate(); // get selected date in milliseconds

        Intent myIntent = new Intent(getBaseContext(),   NewAppointmentActivity.class);
        myIntent.putExtra("date", selectedDate);
        startActivity(myIntent);
    }
}
