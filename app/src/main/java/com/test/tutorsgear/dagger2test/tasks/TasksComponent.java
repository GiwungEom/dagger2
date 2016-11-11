package com.test.tutorsgear.dagger2test.tasks;

import com.test.tutorsgear.dagger2test.data.source.TasksRepositoryComponent;
import com.test.tutorsgear.dagger2test.util.scope.FragmentScoped;
import dagger.Component;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

@FragmentScoped
@Component(dependencies = TasksRepositoryComponent.class, modules = TasksPresenterModule.class)
public interface TasksComponent {

    void inject(TasksActivity activity);
}
