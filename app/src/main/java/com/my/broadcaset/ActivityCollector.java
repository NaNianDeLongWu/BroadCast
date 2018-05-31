package com.my.broadcaset;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by NaNianDeLongWu on 2018/5/31.
 */

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理所有类
 * */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    /**
     * 添加活动
     * */
    public static void addActivitiy(Activity activity){
        activities.add(activity);
    }

    /**
     * 移除活动
     * */
    public static void removeActivitiy(Activity activity){
        activities.remove(activity);
    }

    /**
     * 结束所有活动
     * */
    public static void finishAll(){
        for(Activity activity :activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}

