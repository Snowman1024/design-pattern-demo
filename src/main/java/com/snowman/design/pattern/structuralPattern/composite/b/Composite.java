package com.snowman.design.pattern.structuralPattern.composite.b;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description 树枝 (包含多子节点的操作)
 * @Author Snowman1024
 * @Date 2020/8/12 10:51
 * @Version 1.0
 **/
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();


    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }



    @Override
    public void opertion() {
        for (Component component : children) {
            component.opertion();
        }
    }
}
