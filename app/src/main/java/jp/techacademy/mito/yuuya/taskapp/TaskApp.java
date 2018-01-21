package jp.techacademy.mito.yuuya.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by yuyamito on 2018/01/19.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
