package com.test.tutorsgear.dagger2test;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by giwungeom on 2016. 11. 11..
 */

@Module
public class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
