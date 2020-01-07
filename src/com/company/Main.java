package com.company;

import com.company.abstractFactory.AbstractFactoryPatternDemo;
import com.company.build.BuilderPatternDemo;
import com.company.factory.FactoryPattern;
import com.company.observer.ObserverPatternDemo;

public class Main {

    public static void main(String[] args) {
//        new FactoryPattern(); //工厂模式
//        new AbstractFactoryPatternDemo(); //抽象工厂模式
//        new BuilderPatternDemo(); //建造者模式
        new ObserverPatternDemo();//观察者模式
    }
}
