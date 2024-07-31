package com.zerobase.aoppractice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlarmGreetingMachineAspect {
    @Before(value = "@annotation(AlarmGreetingMachine)")
    public void alarm(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        User user = (User) args[0];
        String username = user.getName();

        StoreAbstract storeAbstract = (StoreAbstract) joinPoint.getTarget();

        if (storeAbstract.isVIP(user)) {
            System.out.println("VIP 유저 입니다! 사은품을 받아가세요!");
        }

        System.out.println(username + "이(가) 방문했습니다.");
    }
}