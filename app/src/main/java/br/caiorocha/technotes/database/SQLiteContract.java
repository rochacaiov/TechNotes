package br.caiorocha.technotes.database;

import android.provider.BaseColumns;

public abstract class SQLiteContract {

    public static class NoteEntry implements BaseColumns{
        public static final String TABLE_NAME = "tb_note";
        public static final String COLUMN_TITLE = "ds_title";
        public static final String COLUMN_CONTENT = "ds_content";
        public static final String COLUMN_LOCATION = "nm_location";
        public static final String COLUMN_ALARM = "ds_alarm";
    }
}
