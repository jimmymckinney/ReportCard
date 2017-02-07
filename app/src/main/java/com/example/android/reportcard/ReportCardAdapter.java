package com.example.android.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCard) {super(context, 0, reportCard);}

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ReportCard currentReportCard = getItem(position);

        TextView courseTitleTextView = (TextView) listItemView.findViewById(R.id.course_title_text_view);
        courseTitleTextView.setText(currentReportCard.getmCourseTitle());
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);
        gradeTextView.setText(currentReportCard.getGrade());

        return listItemView;
    }

}
