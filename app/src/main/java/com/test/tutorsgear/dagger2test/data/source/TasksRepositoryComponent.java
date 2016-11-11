package com.test.tutorsgear.dagger2test.data.source;

import com.test.tutorsgear.dagger2test.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

@Singleton
@Component(modules = {TasksRepositoryModule.class, ApplicationModule.class})
public interface TasksRepositoryComponent {

    TasksRepository getTasksRepository();
}
