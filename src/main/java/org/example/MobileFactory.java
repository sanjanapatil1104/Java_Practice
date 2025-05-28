package org.example;

public class MobileFactory
{
    public static Mobile getMobile(String brand) {
        if (brand.equalsIgnoreCase("samsung")) {
            return new Samsung();
        } else if (brand.equalsIgnoreCase("iphone")) {
            return new iPhone();
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.getMobile("samsung");
        mobile.showModel();
    }
}
