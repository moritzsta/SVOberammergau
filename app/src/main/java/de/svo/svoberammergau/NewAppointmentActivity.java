package de.svo.svoberammergau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewAppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_appointment);

        //int[] date = new int [2];
        //date = getIntent().getIntArrayExtra("date");
        //setDate(date);
        int day = getIntent().getIntExtra("day", 0);
        int month = getIntent().getIntExtra("month", 0);
        int year = getIntent().getIntExtra("year", 0);
        setDate(day, month, year);
    }

    protected void setDate(int day, int month, int year){
        TextView myText = (TextView) findViewById(R.id.date);
        //myText.setText(date[0]+"/"+date[1]+"/"+date[2]);
        myText.setText(day+"/"+month+"/"+year);
    }
}
