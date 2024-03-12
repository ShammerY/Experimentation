import java.util.Scanner;
public class Main {
    private Scanner reader;
    public Main(){
        reader = new Scanner(System.in);
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
                    print("selected 1");
                    break;
                case "2":
                    print("selected 2");
                    break;
                case "0":
                    print("See you next time");
                    break;
                default:
                    print("\nInvalid Option");
            }
        }while(!option.equals("0"));
    }
    public String mainMenu(){
        return  "\n\n-----------MENU-------------"+
                "\n(1) REGISTER EVENT"+
                "\n(2) REGISTER ASSISTANT"+
                "\n(3) PRINT EVENTS"+
                "\n(4) PRINT ASSISTANTS"+
                "\n(5) Register Assistant to Event";
    }

}