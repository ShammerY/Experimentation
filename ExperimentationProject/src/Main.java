import java.util.Scanner;
import model.*;
public class Main {
    private Scanner reader;
    private Controller controller;
    public Main(){
        reader = new Scanner(System.in);
        controller = new Controller();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.executeProgram();
    }
    public void print(Object s){
        System.out.println(s);
    }
    public void executeProgram(){
        String option = "";
        do{
            print(mainMenu());
            option = reader.next();
            switch(option) {
                case "1":
                    print("--Create Event--");
                    print(createEvent());
                    break;
                case "2":
                    print("selected 2");
                    break;
                case "3":
                    print(printEvents());
                    break;
                case "4":
                    print("Print Assistants");
                    break;
                case "0":
                    print("See you next time");
                    break;
                default:
                    print("\nInvalid Option");
            }
        }while(!option.equals("0"));
    }
    public String printEvents(){
        return controller.printEvents();
    }
    public String createEvent(){
        print("\n Enter Title :");
        reader.nextLine();
        String title = reader.nextLine();
        print("TITULO : "+title);
        print("\nEnter Event Tematic :");
        print(eventTematics());
        Tematic tematic;
        //reader.next();
        switch(reader.next()){
            case "1":
                tematic = Tematic.ELECTRONIC;
                break;
            case "2":
                tematic = Tematic.MATHEMATICS;
                break;
            case "3":
                tematic = Tematic.SCIENCE;
                break;
            case "4":
                tematic = Tematic.NATURE;
                break;
            case "5":
                tematic = Tematic.ENTERTAINMENT;
                break;
            case "6":
                tematic = Tematic.SOCIOLOGY;
                break;
            case "7":
                tematic = Tematic.HISTORY;
                break;
            default:
                tematic = Tematic.NONE;
        }
        print("\n Enter ID :");
        String id = reader.next();
        controller.addEvent(new Event(id,title,tematic));
        return "\nEvent Added Succesfully";
    }
    public String mainMenu(){
        return  "\n\n-----------MENU-------------"+
                "\n(1) REGISTER EVENT"+
                "\n(2) REGISTER ASSISTANT"+
                "\n(3) PRINT EVENTS"+
                "\n(4) PRINT ASSISTANTS"+
                "\n(5) Register Assistant to Event";
    }
    public String eventTematics(){
        return "\nTEMATICS :"+
                "\n(1) ELECTRONIC"+
                "\n(2) MATHEMATICS"+
                "\n(3) SCIENCE"+
                "\n(4) NATURE"+
                "\n(5) ENTERTAINMENT"+
                "\n(6) SOCIOLOGY"+
                "\n(7) HISTORY";


    }

}