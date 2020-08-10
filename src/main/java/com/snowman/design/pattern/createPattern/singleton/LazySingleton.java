package com.snowman.design.pattern.createPattern.singleton;

/**
 * @Description 懒汉模式
 * volatile 和 synchronized 能保证线程安全,
 * 但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 *
 * @Author guoqf
 * @Date 2020/7/21 15:24
 * @Version 1.0
 **/
public class LazySingleton {

    /**
     * volatile保证instance在所有线程中同步
     */
    private static volatile LazySingleton singleton;

    private LazySingleton() {
    }

    /**
     * 方法加同步
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (null == singleton) {
            singleton = new LazySingleton();
        } else {
            System.out.println("已经存在实例..");
        }
        return singleton;
    }
}
