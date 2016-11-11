package com.test.tutorsgear.dagger2test.data.source.local;

import android.content.Context;
import android.support.annotation.NonNull;

import com.test.tutorsgear.dagger2test.data.source.TasksDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

public class TasksLocalDataSource implements TasksDataSource {

    public TasksLocalDataSource(@NonNull Context context) {
        checkNotNull(context);
    }
}
