package com.yjhs.androidreview.singleton;

/**
 * author: Administrator
 * date: 2019-8-9
 * desc:静态内部类模式
 */
public class Singleton3 {
    private Singleton3(){}

    private static class CustomManagerHolder {
        private static Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return CustomManagerHolder.INSTANCE;
    }
}
