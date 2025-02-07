package Tests.ExecuteClient;

import Tests.Domain.DecoToken;
import Tests.Domain.TokenT;

import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) {
        TokenT token = new TokenT(1);
        DecoToken decoToken = new DecoToken();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to create a token \n Enter 2 to read a token");
        String choiceInput = input.next();

        switch (choiceInput){
            case "1" :
                token.insertTokenInfosInitial();
                token.typeInsert();
                token.returnToken();
                break;
            case "2" :
                decoToken.insertToken();
                decoToken.breakToken();
                break;
        }
    }
}
