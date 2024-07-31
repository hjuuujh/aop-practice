package com.zerobase.aoppractice;

public class User {
    private String name;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greeting() {
        return "hello";
    }

    public void visitTo(Store store) {
        // store 에 user 방문을 알림
        store.visitedBy(this);
    }

}
