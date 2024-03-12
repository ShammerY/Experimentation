package model;

public class Event {
    private Integer id;
    private String title;
    private Tematic tematic;
    public Event(Integer newId,String newTitle,Tematic newTematic){
        id = newId;
        title = newTitle;
        tematic = newTematic;
    }
    public void setId(Integer newId){
        id = newId;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public void setTematic(Tematic newTematic){
        tematic = newTematic;
    }
    public String getTitle(){
        return title;
    }
    public Integer getId(){
        return id;
    }
    public Tematic getTematic(){
        return tematic;
    }
}
