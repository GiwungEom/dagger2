package com.test.tutorsgear.dagger2test.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

public class TasksPersistenceContract {

    private TasksPersistenceContract() {}

    public static abstract class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "task";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_COMPLETED = "completed";
    }
}
