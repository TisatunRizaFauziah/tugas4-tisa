package com.tugas4.tisatun.models;

public class Chef {
    private Integer id;
    private String name;
    private String asal;

    public Chef(Integer id, String name, String asal) {
        this.id = id;
        this.name = name;
        this.asal = asal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    
    
    
}
