package com.test.tutorsgear.dagger2test.data.source;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

@Singleton
public class TasksRepository implements TasksDataSource {

    private final TasksDataSource mTasksRemoteDataSource;

    private final TasksDataSource mTasksLocalDastaSource;

    @Inject
    TasksRepository(@Remote TasksDataSource tasksRemoteDataSource,
                    @Local TasksDataSource tasksLocalDataSource) {

        mTasksLocalDastaSource = tasksLocalDataSource;
        mTasksRemoteDataSource = tasksRemoteDataSource;
    }

}
