package com.test.tutorsgear.dagger2test.tasks;

import com.test.tutorsgear.dagger2test.base.BasePresenter;
import com.test.tutorsgear.dagger2test.base.BaseView;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

public interface TasksContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }

}
