package com.yjhs.androidreview.singleton;

import android.content.Context;

/**
 * author: Administrator
 * date: 2019-8-9
 * desc:恶汉式单列
 */
public class Singleton {
    private Context mContext;
    private static final Object mLock = new Object();
    private static Singleton mInstance;
    //私有化构造方法
    private Singleton(Context context){
        this.mContext = context.getApplicationContext();
    }
    public Singleton getInstance(Context context){
        synchronized (mLock){
            if (mInstance == null){
                mInstance = new Singleton(context);
            }
            return mInstance;
        }
    }
}
