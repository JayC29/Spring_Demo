package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="Employees")
public class Employee {

    @Id
    @Column(name="Employee_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   employeeId;

    @Column(name="Years_Experience")
    private int    yearsExperience;

    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="Email_Address")
    private String emailAddress;

    @Column(name="Phone_Number")
    private String phoneNumber;

    @Column(name="Current_Job_Title")
    private String currentJobTitle;

    @Column(name="Manager_Name")
    private String managerName;

    @Column(name="Hashed_PW")
    private String HashedPw;

    protected Employee() {}

    public Employee(String firstName, String lastName, String emailAddress, String phoneNumber, String currentJobTitle
            , int yearsExperience, String managerName, String HashedPw) {

        this.firstName        = firstName;
        this.lastName         = lastName;
        this.emailAddress     = emailAddress;
        this.phoneNumber      = phoneNumber;
        this.currentJobTitle  = currentJobTitle;
        this.yearsExperience  = yearsExperience;
        this.managerName      = managerName;
        this.HashedPw         = HashedPw;

    }

    //getter and setters for variables
    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public int getYearsExperience() {
        return this.yearsExperience;
    }

    public void setYearsExperience(int years_Experience) {
        this.yearsExperience = years_Experience;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCurrentJobTitle() {
        return this.currentJobTitle;
    }

    public void setCurrentJobTitle(String currentJobTitle) {
        this.currentJobTitle = currentJobTitle;
    }

    public String getManagerName() {
        return this.managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getHashedPw() {
        return this.HashedPw;
    }

    public void setHashedPw(String HashedPw) {
        this.HashedPw = HashedPw;
    }
}
