package com.example.notebook;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.notebook.domain.Note;

import java.util.List;


public class NoteFragment extends Fragment {

    private LinearLayout container;

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
    }

    public void showNotes(List<Note> notes) {
        View itemNote = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, container, false);

        itemNote.setOnClickListener(view -> {
            Intent intent = new Intent(requireContext(), EditActivity.class);
            startActivity(intent);
        });
    }


}