package com.baseDesignPatterns.creational.builder;

public class Buider {
    public static void main(String[] args) {
        WebSite webSite = new WebSite();
        webSite.setName("Yoyo");
        webSite.setCrm(CRM.WordPress);
    }
}
