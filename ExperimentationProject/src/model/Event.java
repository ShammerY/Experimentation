package model;

public class Event {
    private String id;
    private String title;
    private Tematic tematic;
    public Event(String newId,String newTitle,Tematic newTematic){
        id = newId;
        title = newTitle;
        tematic = newTematic;
    }
    public void setId(String newId){
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
    public String getId(){
        return id;
    }
    public Tematic getTematic(){
        return tematic;
    }
}
