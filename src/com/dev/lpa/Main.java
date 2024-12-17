package com.dev.lpa;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Yilikal", "0911438450");
        Contact contact2 = new Contact("Tigist", "0930518247");
        Contact contact3 = new Contact("Mom", "0912029623");
        Contact contact4 = new Contact("Home","0112792263");
        Contact contact5 = new Contact("Endy","0911780501");
        Contact contact6 = new Contact("David","0912792263");

        MobilePhone mp1 = new MobilePhone("0911438450");
        mp1.addNewContact(contact1);
        mp1.addNewContact(contact2);
        mp1.addNewContact(contact3);
        mp1.addNewContact(contact4);
        mp1.addNewContact(contact4);
        System.out.println(mp1.addNewContact(contact5));
        mp1.printContacts();
        mp1.updateContact(contact5, contact6);
        mp1.removeContact(contact1);
        mp1.removeContact(contact1);
        //mp1.addNewContact(contact5);
        //System.out.println(mp1.queryContact("Tigist"));
        mp1.printContacts();
    }
}
