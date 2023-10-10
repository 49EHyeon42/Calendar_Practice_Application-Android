package dev.ehyeon.calendarpracticeapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import org.threeten.bp.LocalDate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCalendarView materialCalendarView = findViewById(R.id.calendarView);

        materialCalendarView.setSelectedDate(LocalDate.now());

        materialCalendarView.addDecorators(new SaturdayViewDecorator(), new SundayViewDecorator());

        materialCalendarView.setOnDateChangedListener((widget, date, selected) ->
                Toast.makeText(this, date.getYear() + "-" + date.getMonth() + "-" + date.getDay(), Toast.LENGTH_SHORT).show());
    }
}
