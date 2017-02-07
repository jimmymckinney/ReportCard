package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an array of grades
        ArrayList<ReportCard> grade = new ArrayList<ReportCard>();
        grade.add(new ReportCard("Adv. English 6","A"));
        grade.add(new ReportCard("MS READ 180","C"));
        grade.add(new ReportCard("Investig in Science 6","E"));
        grade.add(new ReportCard("C2.0 MATH 6","A"));
        grade.add(new ReportCard("ESOL 3 Developing MS","A"));
        grade.add(new ReportCard("MS FY Info & Communications Technology","E"));
        grade.add(new ReportCard("PHYS ED GRADE 6","A"));
        grade.add(new ReportCard("ADV WRLD STDS 6","E"));

        ReportCardAdapter adapter = new ReportCardAdapter(this, grade);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
