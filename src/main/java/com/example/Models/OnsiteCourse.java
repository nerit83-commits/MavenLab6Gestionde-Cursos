package com.example.Models;

public class OnsiteCourse extends Course{
    private int room;
    private int maxQuota;

    public OnsiteCourse(String title, int duration, int room, int maxQuota) {
        super(title, duration);
        this.room = room;
        setMaxQuota(maxQuota);
    }

    public OnsiteCourse(String title, int duration, String professor, int room, int maxQuota) {
        super(title, duration, professor, "", room, maxQuota);
        this.room = room;
        setMaxQuota(maxQuota);
    }

    @Override
    public void showInformation() {
        System.out.println("[Onsite] " + getTitle() + " (" + getDuration() + " hr) - Professor: " + getProfessor() + " - Room: " + room + ", MaxQuota: " + maxQuota);
    }

    //Getters y setters.
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }

    public int getMaxQuota() {
        return maxQuota;
    }
    public void setMaxQuota(int maxQuota) {
        if (maxQuota < 0) {
            System.out.println( "El cupo no puede ser negatio. Se establecerá en 0.");
            this.maxQuota = 0;
        } else {
            this.maxQuota = maxQuota;
        }
    }
}
