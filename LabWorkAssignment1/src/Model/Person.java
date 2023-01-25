/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 91730
 */
public class Person {
    
    long nuid;
    String firstName;
    String lastName;
    String collegeName;
    
    Contact officeContact;
    Contact personalContact;
    
    Address currentAddress;
    Address permanentAddress;

    public Person() {
        
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        
        this.officeContact = new Contact();
        this.personalContact = new Contact();
        
        this.currentAddress = new Address();
        this.permanentAddress = new Address();
        
    }

    public long getNuid() {
        return nuid;
    }

    public void setNuid(long nuid) {
        this.nuid = nuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
    
}
