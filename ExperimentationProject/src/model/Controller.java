package model;
import java.util.ArrayList;

public class Controller {
    private ArrayList<Event> events;
    private ArrayList<Assistant> assistants;
    public Controller(){
        events = new ArrayList<>();
        assistants = new ArrayList<>();
    }
    public void addEvent(Event newEvent){
        events.add(newEvent);
    }
    public void addAssistant(Assistant newAssistant){
        assistants.add(newAssistant);
    }
    public String printEvents(){
        String msj = "";
        for(int i=0;i<events.size();i++){
            msj += "\n"+
                    "\n   TITLE : "+events.get(i).getTitle()+
                    "\n TEMATIC : "+events.get(i).getTematic()+
                    "\n      ID : "+events.get(i).getId();
        }
        return msj;
    }
}
