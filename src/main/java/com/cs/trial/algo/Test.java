package com.cs.trial.algo;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    static {
        System.out.println("parent static");
    }

    {
        System.out.println("Pareent initail");

    }

    public Test() {
        System.out.println("Parent ");
    }
}
