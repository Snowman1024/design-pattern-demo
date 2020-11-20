package com.snowman.design.pattern.behavioralPattern.visitor.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 11:18
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //材料集对象
        SetMaterial os = new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());

        //艺术公司
        Company visitor1 = new ArtCompany();
        String r1 = os.accept(visitor1);
        System.out.println(r1);
        System.out.println("-------------------");

        //造币公司
        Company visitor2 = new Mint();
        String r2 = os.accept(visitor2);
        System.out.println(r2);


    }
}
