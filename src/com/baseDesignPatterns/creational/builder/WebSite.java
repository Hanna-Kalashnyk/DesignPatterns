package com.baseDesignPatterns.creational.builder;

public class WebSite {
    String name;
    CRM crm;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", crm=" + crm +
                '}';
    }

    public void setCrm(CRM crm) {
        this.crm = crm;

    }
}
