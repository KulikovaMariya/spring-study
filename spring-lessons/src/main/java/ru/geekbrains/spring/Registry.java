package ru.geekbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {
    @Value("17")
    private int cubNum;
    private Woman woman;

    public Registry() {
    }

    public Registry(int cubNum) {
        this.cubNum = cubNum;
    }

    @Autowired
    public void setWoman(Woman woman) {
        this.woman = woman;
        System.out.println("Женщина пришла на работу");
    }

    public int getCubNum() {
        return cubNum;
    }

    public void setCubNum(int cubNum) {
        this.cubNum = cubNum;
    }

    public Referral getReferral() {
        System.out.println("Выданно");
        return new Referral();

    }
}
