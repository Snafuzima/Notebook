package com.example.notebook.domain;

import android.annotation.SuppressLint;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesListRepository implements NoteList{


    @Override
    public List<Note> notes() {
        ArrayList<Note> res = new ArrayList<>();
        res.add(new Note("1","Name 1", "Bla bla bla bla bla bla bla bla bla bla"));
        res.add(new Note("2","Name 2", "Bla bla bla bla bla bla bla bla bla bla"));
        res.add(new Note("3","Name 3", "Bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla"));
        res.add(new Note("4","Name 4", "Bla bla bla bla bla bla bla bla bla bla"));
        return res;
    }


}
