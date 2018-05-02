package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {
    public static void main(String[] args) {
        Animal one= new Animal(); //1
        /*向上转型，隐式转换，自动转型
        父类引用指向子类实例
        注意：父类中静态方法无法被子类重写，所以向上转型之后，只能调用到父类原有的静态方法
        * 小蕾转型大类
        * */
        Animal two = new Cat(); //2
        Animal three = new Dog(); //3
        one.eat();
        two.eat();
        three.eat();
        two.setMonth(2);
        two.getMonth();
        three.eat();
        System.out.println("==============");
        /*向下转型。强制类型转换
        * 子类引用指向父类对象 此处必须进行强转，可以调用子类特有方法
        * 必须满足转换条件才能进行强制转换
        * instanceof运算符:返回true/false*/
        if (two instanceof Cat){
            Cat temp = (Cat)two;
            temp.eat();
            temp.run();
            temp.getMonth();
            System.out.println("two可以转换为Cat类型");
        }

        if (two instanceof Dog) {
            Dog temp2 = (Dog) two;
            temp2.eat();
            temp2.sleep();
            temp2.getSex();
            System.out.println("two可以转换为Dog类型");
        }
        if (two instanceof Animal) {
            System.out.println("Animal");
        }
        if (two instanceof Object) {
            System.out.println("Object");
        }
    }
}
