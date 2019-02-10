package com.company.stories.clinic;

public class Appointment {
    private int vetId;
    private String procedures;

    public Appointment(int vetId, String procedures) {
        this.vetId = vetId;
        this.procedures = procedures;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getProcedures() {
        return procedures;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }
}
