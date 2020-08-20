package com.snowman.design.pattern.createPattern.singleton;

/**
 * @Description 懒汉模式
 * 类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，
 * 所以是线程安全的，可以直接用于多线程而不会出现问题。
 * @Author Snowman1024
 * @Date 2020/7/21 15:30
 * @Version 1.0
 **/
public class HugrySingleton {

    private static final HugrySingleton singleton = new HugrySingleton();

    private HugrySingleton() {

    }

    public static HugrySingleton getInstance() {
        return singleton;
    }

}
