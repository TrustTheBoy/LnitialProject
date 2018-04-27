package com.imooc.animal;
//final class:该类没有子类 public final \ final public class
// final 方法：该方法不允许被子类重写 但是可以正常被子类继承使用
// final 方法内部局部变量：只要在具体被使用之前进行赋值即可，一旦赋值不允许被修改
//类中成员属性：赋值过程：1、定义直接初始化 2、构造方法 3、构造代码块
public class Animal {
    /**
     * private:只允许在本类中进行访问
     * publick：允许在任意位置访问
     * protected:允许当前类、同包子类/非子类、跨包子类掉用、跨包非子类不允许
     * 默认：允许在当前类、同包子类/非子类调用；跨包子类/非子类不允许调用
     * */
    private String name="倪妮";
    private int month=2;
    String species="动物";
    public int temp = 15;
    private static int st1 = 22;
    public static int st2 = 23;
    static{
        System.out.println("我是父类的静态代码块");
    }
    {
        System.out.println("我是父类的构造代码块");
    }
//    父类的构造不允许被继承，不允许被重写
    public Animal(){
        System.out.println("我是父类的无参构造方法");
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void eat(){
        System.out.println(this.getName()+"在吃东西");
    }

}
