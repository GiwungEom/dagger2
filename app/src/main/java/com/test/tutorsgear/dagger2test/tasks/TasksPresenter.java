package com.test.tutorsgear.dagger2test.tasks;

import com.test.tutorsgear.dagger2test.data.source.TasksRepository;

import javax.inject.Inject;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

public class TasksPresenter implements TasksContract.Presenter {

    private final TasksRepository mTasksRepository;

    private final TasksContract.View mTasksView;


    private TasksFilterType mCurrentFilterType;


    @Inject
    TasksPresenter(TasksRepository tasksRepository, TasksContract.View tasksView) {
        mTasksRepository = tasksRepository;
        mTasksView = tasksView;
    }

    @Override
    public void start() {

    }

    public void setFiltering(TasksFilterType filterType) {

    }

    public TasksFilterType getFiltering() {
        return mCurrentFilterType;
    }
}
