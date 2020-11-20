package com.snowman.design.pattern.behavioralPattern.visitor.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 11:16
 * @Version 1.0
 **/
public class SetMaterial {

    private List<Material> list = new ArrayList<Material>();

    /**
     * 添加材料
     *
     * @param element
     */
    public void add(Material element) {
        list.add(element);
    }

    /**
     * 删除材料
     *
     * @param element
     */
    public void remove(Material element) {
        list.remove(element);
    }


    public String accept(Company visitor) {
        Iterator<Material> i = list.iterator();
        String tmp = "";
        while (i.hasNext()) {
            tmp += (i.next()).accept(visitor) + " ";
        }
        //返回某公司的作品集
        return tmp;
    }
}
