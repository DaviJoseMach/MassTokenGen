package Tests.Domain;

import java.util.Scanner;

public class Type {
    private String[][] types = {
            {"chore", "1"},
            {"docs", "2"},
            {"feat", "3"},
            {"fix", "4"},
            {"refactor", "5"},
            {"style", "6"},
            {"test", "7"}
    };

    public void typeInsert(){
        System.out.println("--- Enter the changes made ---");
        Scanner input = new Scanner(System.in);
        String inputType = input.nextLine();

        String[] inType = inputType.split(",");

        for(String type : inType){
            type = type.trim();
            if(!isValidType(type)){
                System.out.println("❌ Invalidi type");
            }
        }
    }

    private boolean isValidType(String type){
        for(String[] entry : types){
            if(entry[0].equals(type)){
                return true;
            }
        } return false;
    }
}
