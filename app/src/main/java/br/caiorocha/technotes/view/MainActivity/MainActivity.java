package br.caiorocha.technotes.view.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import br.caiorocha.technotes.R;
import br.caiorocha.technotes.controller.NoteController;
import br.caiorocha.technotes.model.Note;
import br.caiorocha.technotes.view.MainActivity.adapters.NotesAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NotesAdapter adapter;
    private List<Note> noteList;

    private NoteController noteController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.noteController = new NoteController(this);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_main));

        recyclerView = findViewById(R.id.recycler_view);

        NotesAdapter notesAdapter = new NotesAdapter(
                this,
                this.noteController.getTitles(),
                this.noteController.getContents()
        );

        recyclerView.setAdapter(notesAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
    private void prepareNotes(){
        Note note = new Note(1, "Senhas de Banco");
        noteList.add(note);

        note = new Note(2, "Aulas Faculdade");
        noteList.add(note);

        note = new Note(3, "Exercícios Academia");
        noteList.add(note);

        adapter.notifyDataSetChanged();
    }
     **/
}
