package com.example.notebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.notebook.domain.Note;
import com.example.notebook.domain.NotesListRepository;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class NoteFragment extends Fragment {

    private RecyclerView container;
    private final NotesAdapter adapter = new NotesAdapter();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_note, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        container = view.findViewById(R.id.main_fragment);
        container.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        container.setAdapter(adapter);

        ArrayList<Note> res = new ArrayList<>();
        res.add(new Note("1", "Name 1", "Bla bla bla bla bla bla bla bla bla bla"));
        res.add(new Note("2", "Name 2", "Bla bla bla bla bla bla bla bla bla bla"));
        res.add(new Note("3", "Name 3", "Bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla"));
        res.add(new Note("4", "Name 4", "Bla bla bla bla bla bla bla bla bla bla"));

        showNotes(res);
    }

    public void showNotes(List<Note> notes) {
        adapter.setNotes(notes);

    }


}