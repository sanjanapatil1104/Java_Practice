package org.example;


public class Client {


    public static void main(String[] args) {
        Mobile mobile = MobileFactory.getMobile("iphone");
        mobile.showModel();
        mobile = MobileFactory.getMobile("samsung");
        mobile.showModel();
    }
}