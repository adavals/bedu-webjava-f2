package org.bedu.java.backend.sesion4.model;

public class Persona {
    private String country;
    private String name;
    private String age;
    private String occupation;
    private String email;

    //Agregar constructor sin parámetros
    public Persona() {

    }

    //Agregar constructor con parámetros
    public Persona(String country, String name, String age, String occupation, String email) {
        this.country = country;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //@Override para sobreescribir toString y mostrar valores
    @Override
    public String toString() {
        return "Name: " +  name + "\nCountry: " + country + "\nAge: " + age + "\nOccupation: " + occupation + "\nE-mail: " + email;
    }
}
