package com.snowman.design.pattern.createPattern.prototype.three;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/24 14:21
 * @Version 1.0
 **/
public class ProtoTypeManager {

    private Map<String, Shape> ht = new HashMap();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape tem = ht.get(key);
        return (Shape) tem.clone();
    }


}
