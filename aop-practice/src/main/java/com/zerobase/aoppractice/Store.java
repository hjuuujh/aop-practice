package com.zerobase.aoppractice;

public class Store {
    private String name;

    private int visitCountByUser = 0;

    public String getOperationTime() {
        return "AM 08:00 ~ PM 08:00";
    }

//    @AlarmGreetingMachine
    public void visitedBy(User user) {
        // 핵심 1
        greeting(user);
        visitCountByUser++;
    }

    public boolean isVIP(User user) {
        return visitCountByUser > 10;
    }

    public void setVisitCountByUser(int visitCountByUser) {
        this.visitCountByUser = visitCountByUser;
    }

    private void greeting(User user) {
        // proxy
        IGreetingMachine greetingMachine = new GreetingMachineProxy();
        greetingMachine.greet(user);

        // -> 부가기능 사용하지 않고 핵심기능만 필요하면 greetmachine이용
//        IGreetingMachine greetingMachine = new GreetingMachine();
//        greetingMachine.greet(user);
    }
}
