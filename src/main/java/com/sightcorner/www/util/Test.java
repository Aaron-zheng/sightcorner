package com.sightcorner.www.util;

import java.util.ArrayList;

/**
 * Created by zhengfucheng on 23/2/2017.
 */
public class Test {




    public static void main(String args[]) {

        System.out.println(new SubClass());
    }
}


class SuperClass {


    static {
        System.out.println("Super");
    }


    static int val = 1;
}

class SubClass extends  SuperClass {
    static {
        System.out.println("Sub");
    }
}