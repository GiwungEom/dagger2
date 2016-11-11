package com.test.tutorsgear.dagger2test;

import android.app.Application;

import com.test.tutorsgear.dagger2test.data.source.DaggerTasksRepositoryComponent;
import com.test.tutorsgear.dagger2test.data.source.TasksRepositoryComponent;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

public class ToDoApplication extends Application {

    private TasksRepositoryComponent mRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mRepositoryComponent = DaggerTasksRepositoryComponent.builder()
                .applicationModule(new ApplicationModule((getApplicationContext())))
                .build();
    }

    public TasksRepositoryComponent getTasksRepositoryComponent() {
        return mRepositoryComponent;
    }
}
