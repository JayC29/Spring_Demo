package com.example.demo;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   Employee_ID;
    private int    Years_Experience;
    private String First_Name;

    @Column(name="Last_Name")
    private String lastName;
    private String Email_Address;
    private String Phone_Number;



    private String Current_Job_Title;
    private String Manager_Name;
    private String Hashed_PW;

    protected Employee() {}

    public Employee(String First_Name, String Last_Name, String Email_Address, String Phone_Number, String Current_Job_Title
                        , int Years_Experience, String Manager_Name, String Hashed_PW) {

        this.First_Name        = First_Name;
        this.lastName         = Last_Name;
        this.Email_Address     = Email_Address;
        this.Phone_Number      = Phone_Number;
        this.Current_Job_Title = Current_Job_Title;
        this.Years_Experience  = Years_Experience;
        this.Manager_Name     = Manager_Name;
        this.Hashed_PW         = Hashed_PW;

    }

    public Long getEmployee_ID() {
        return this.Employee_ID;
    }

    public void setEmployee_ID(Long employee_ID) {
        this.Employee_ID = employee_ID;
    }

    public int getYears_Experience() {
        return this.Years_Experience;
    }

    public void setYears_Experience(int years_Experience) {
        this.Years_Experience = years_Experience;
    }

    public String getFirst_Name() {
        return this.First_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.First_Name = first_Name;
    }

    public String getlastName() {
        return this.lastName;
    }

    public void setlastName(String last_Name) {
        this.lastName = last_Name;
    }

    public String getEmail_Address() {
        return this.Email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.Email_Address = email_Address;
    }

    public String getPhone_Number() {
        return this.Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.Phone_Number = phone_Number;
    }

    public String getCurrent_Job_Title() {
        return this.Current_Job_Title;
    }

    public void setCurrent_Job_Title(String current_Job_Title) {
        this.Current_Job_Title = current_Job_Title;
    }

    public String getManager_Name() {
        return this.Manager_Name;
    }

    public void setManager_Name(String manaager_Name) {
        this.Manager_Name = manaager_Name;
    }

    public String getHashed_PW() {
        return this.Hashed_PW;
    }

    public void setHashed_PW(String hashed_PW) {
        this.Hashed_PW = hashed_PW;
    }
}
