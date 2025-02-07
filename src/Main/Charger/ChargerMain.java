package Main.Charger;
import Main.Domain.TokenDecoder;
import Main.Domain.TokenGenerator;

import java.util.Scanner;

public class ChargerMain {
    public void ChargerLoad(){
        TokenGenerator generatorToken = new TokenGenerator();
        TokenDecoder decoderToken = new TokenDecoder();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to create a token \n Enter 2 to read a token");
        String choiceInput = input.next();

        switch (choiceInput){
            case "1" :
                generatorToken.insertTokenInfosInitial();
                generatorToken.typeInsert();
                generatorToken.returnToken();
                break;
            case "2" :
                decoderToken.insertToken();
                decoderToken.breakToken();
                break;
        }

    }
}
