package com.example.notebook.domain;

import android.annotation.SuppressLint;

import androidx.annotation.StringRes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {

    private  String id;
    private  String name;
    private  String description;
    private  String date;

    public Note(String id, String name, String description) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.date=getDateTime();
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getName() {return name;}

    private String getDateTime() {
        @SuppressLint("SimpleDateFormat")
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
