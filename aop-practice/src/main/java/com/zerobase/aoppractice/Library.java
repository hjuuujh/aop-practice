package com.zerobase.aoppractice;
import org.springframework.stereotype.Component;

@Component
public class Library extends StoreAbstract{
    private String name;

    private int visitCountByUser = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @AlarmGreetingMachine
    public void visitedBy(User user) {
        System.out.println("환영합니다! " + getName() + " 입니다!");
    }

    public boolean isVIP(User user) {
        return visitCountByUser > 10;
    }

    public void setVisitCountByUser(int count) {
        this.visitCountByUser = count;
    }
}