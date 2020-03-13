package br.caiorocha.technotes.controller;

import android.content.ContentValues;
import android.content.Context;

import br.caiorocha.technotes.R;
import br.caiorocha.technotes.database.DAO.NoteDAO;
import br.caiorocha.technotes.database.SQLiteContract;
import br.caiorocha.technotes.model.Note;

public class NoteController {
    private NoteDAO noteDAO;
    private String titles[], contents[];

    public NoteController(Context context){
        this.noteDAO = new NoteDAO(context);

        this.titles = context.getResources().getStringArray(R.array.noteTitles);
        this.contents = context.getResources().getStringArray(R.array.noteContents);
    }

    public long newNote(Note note){
        // Adicionar notas contendo apenas o título
        ContentValues values = new ContentValues();
        values.put(SQLiteContract.NoteEntry.COLUMN_TITLE, note.getTitle());
        return this.noteDAO.insert(values);
    }

    public void updateNote(Note note){
        // Atualizar a nota de acordo com as modificações feitas pelo usuário
    }

    public void removeNote(Note note){
        //
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public String[] getContents() {
        return contents;
    }

    public void setContents(String[] contents) {
        this.contents = contents;
    }
}
