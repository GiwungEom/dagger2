package com.test.tutorsgear.dagger2test.data.source;

import android.content.Context;

import com.test.tutorsgear.dagger2test.data.FakeTasksRemoteDataSource;
import com.test.tutorsgear.dagger2test.data.source.local.TasksLocalDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

@Module
public class TasksRepositoryModule {

    @Singleton
    @Provides
    @Local
    TasksDataSource provideTasksLocalDataSource(Context context) {
        return new TasksLocalDataSource(context);
    }

    @Singleton
    @Provides
    @Remote
    TasksDataSource provideTasksRemoteDataSource() {
        return new FakeTasksRemoteDataSource();
    }

}
