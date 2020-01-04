package com.company.singleObject;

/**
 * 懒汉式与饿汉式的根本区别在与是否在类内方法外创建自己的对象。
 *
 * 并且声明对象都需要私有化，构造方法都要私有化，这样外部才不能通过 new 对象的方式来访问。
 *
 * 饿汉式的话是声明并创建对象(因为他饿)，懒汉式的话只是声明对象，在调用该类的 getinstance() 方法时才会进行 new 对象。
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}