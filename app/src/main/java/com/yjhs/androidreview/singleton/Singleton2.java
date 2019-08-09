package com.yjhs.androidreview.singleton;

import android.content.Context;

/**
 * author: Administrator
 * date: 2019-8-9
 * desc:双重检查模式
 */
public class Singleton2 {
    private Context mContext;
    private volatile static Singleton2 mInstance;

    public static Singleton2 getInstance(Context context) {
        // 避免非必要加锁
        if (mInstance == null) {
            synchronized (Singleton2.class) {
                if (mInstance == null) {
                    mInstance = new Singleton2(context);
                }
            }
        }

        return mInstance;
    }

    private Singleton2(Context context) {
        this.mContext = context.getApplicationContext();
    }
}
