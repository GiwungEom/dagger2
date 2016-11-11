package com.test.tutorsgear.dagger2test.tasks;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

public class TasksFragment extends Fragment implements TasksContract.View {

    public TasksFragment() {
        // Requires empty public contructor
    }

    public static TasksFragment newInstance() {
        return new TasksFragment();
    }

    @Override
    public void onCreate(Bundle savedInstancState) {
        super.onCreate(savedInstancState);
        
    }

    @Override
    public void setPresenter(TasksContract.Presenter presenter) {

    }
}
