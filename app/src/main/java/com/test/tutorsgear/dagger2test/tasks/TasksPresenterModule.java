package com.test.tutorsgear.dagger2test.tasks;

import dagger.Module;
import dagger.Provides;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

@Module
public class TasksPresenterModule {

    private final TasksContract.View mView;

    public TasksPresenterModule(TasksContract.View view) {
        mView = view;
    }

    @Provides
    TasksContract.View provideTasksContractView() {
        return mView;
    }
}
