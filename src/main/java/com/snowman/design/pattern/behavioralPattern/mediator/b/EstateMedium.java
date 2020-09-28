package com.snowman.design.pattern.behavioralPattern.mediator.b;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 具体中介者：房地产中介
 * @Author Snowman1024
 * @Date 2020/9/24 17:14
 * @Version 1.0
 **/
public class EstateMedium implements Medium {

    private List<Customer> members = new ArrayList<>();


    @Override
    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (Customer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ob.receive(from, ad);
            }
        }
    }
}
