package com.zerobase.aoppractice;

public abstract class StoreAbstract {
    abstract void visitedBy(User user);

    abstract boolean isVIP(User user);
}