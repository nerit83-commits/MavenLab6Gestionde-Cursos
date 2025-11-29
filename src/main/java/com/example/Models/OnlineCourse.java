package com.example.Models;

public class OnlineCourse extends Course {
    private String plataform;

    public OnlineCourse(String title, int duration, String plataform) {
        super(title, duration);
        this.plataform = plataform;
    }

    public OnlineCourse(String title, int duration, String professor, String plataform) {
        super(title, duration, professor, "", 0, 0);
        this.plataform = plataform;
    }
    @Override
    public void showInformation() {
        System.out.println("[Online] " + getTitle() + " (" + getDuration() + " hr) - Professor: " + getProfessor() + " - Plataform: " + plataform);
    }

    //Getters y setters
    public String getPlataform() {
        return plataform;
    }
    public void setPlataform(String plataform){
        this.plataform = plataform;
    }
}