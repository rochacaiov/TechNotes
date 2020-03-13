package br.caiorocha.technotes.database.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.caiorocha.technotes.database.SQLiteContract;
import br.caiorocha.technotes.database.SQLiteSupport;

public class NoteDAO {
    private SQLiteSupport connection;

    public NoteDAO(Context context){
        this.connection = new SQLiteSupport(context);
    }

    public long insert(ContentValues values){
        SQLiteDatabase db = this.connection.getWritableDatabase();
        return db.insert(SQLiteContract.NoteEntry.TABLE_NAME, null, values);
    }


}
