package com.example.结构型模式.外观模式;

import junit.framework.TestCase;

public class TravelFacadeImplTest extends TestCase {
    public static void main(String[] args) {
        TravelFacade travelFacade=new TravelFacadeImpl();
        travelFacade.dePart();
        System.out.println("-------出发-----------");
    }
}