package com.zerobase.aoppractice;

public class Store {
    private String name;


    public void visitedBy(User user) {
        // 핵심 1
        greeting(user);
    }

    private void greeting(User user) {
        // proxy
//        IGreetingMachine greetingMachine = new GreetingMachineProxy();
//        greetingMachine.greet(user);

        // -> 부가기능 사용하지 않고 핵심기능만 필요하면 greetmachine이용
//        IGreetingMachine greetingMachine = new GreetingMachine();
//        greetingMachine.greet(user);

        // decorator
        IGreetingMachine greetingMachine = new DancingGreetingMachineDecorator(new AlarmGreetingMachineDecorator(new GreetingMachine()));
        greetingMachine.greet(user);
    }
}
