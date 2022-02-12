package com.cs.trial.algo;

class Person<T> {

    void set(T t) {

        System.out.println(t);
    }

    private String firstName;
    private String lastName;



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

     public static void main(String[] args) {
         Person<String> p = new Person<>();
         Person p1 = p;
     }
}
