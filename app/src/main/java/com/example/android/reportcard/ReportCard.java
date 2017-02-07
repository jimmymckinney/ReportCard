package com.example.android.reportcard;

public class ReportCard {
    private String mCourseTitle;
    private String mGrade;

    public ReportCard(String CourseTitle, String grade) {
        mCourseTitle = CourseTitle;
        mGrade = grade;
    }

    public String getmCourseTitle() {
        return mCourseTitle;
    }

    public String getGrade() {
        return mGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mCourseTitle='" + mCourseTitle + '\'' +
                ", mGrade='" + mGrade + '\'' +
                '}';
    }
}
