package model;

public class Assistant {
    private String id;
    private String name;
    private Speciality speciality;
    private String nacionality;
    public Assistant(String newId,String newName,Speciality newSpeciality,String newNacionality){
        id = newId;
        name = newName;
        speciality = newSpeciality;
        nacionality = newNacionality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
}
