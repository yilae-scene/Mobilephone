package com.dev.lpa;

import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContact = new ArrayList<>();
    }

    public boolean addNewContact (Contact contact){
        int index = findContact(contact.getName());
        if(index >= 0) {
            System.out.println("Contact already exists");
            return false;
        }
        myContact.add(contact);
        return false;

    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index >= 0){
            myContact.set(index, newContact);
            return true;
        }

        return false;
    }

    public boolean removeContact(Contact oldContact){
        int index = findContact(oldContact);
        return (index >= 0) ? (myContact.remove(myContact.get(index))) : false;
    }

    private int findContact(Contact lookingFor){
        if(myContact.contains(lookingFor)){
            return myContact.indexOf(lookingFor);
        }
        return -1;
    }

    private int findContact(String lookingName) {
            for(int i = 0; i < myContact.size(); i++){
                if(myContact.get(i).getName().equals(lookingName)){
                    return i;
                }
            }
            return -1;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        return (index >= 0) ? myContact.get(index) : null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContact.size(); i++){
            System.out.println(i+1 +". "+myContact.get(i).getName()+" -> "+myContact.get(i).getPhoneNumber());
        }
    }
}