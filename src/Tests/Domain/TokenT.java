package Tests.Domain;


import java.util.Scanner;

public class TokenT {
    private int testId;

    public TokenT(int testId) {
        this.testId = testId;
    }

    public void insertTokenInfosInitial(){
        Scanner inputInitial = new Scanner(System.in);

        System.out.println("--- Enter the project name ---");
        String inputProjectName = inputInitial.nextLine();
        System.out.println("-- Enter your branch name --");
        String inputBranchName = inputInitial.nextLine();
        System.out.println("- Enter today's date -");
        String inputDate = inputInitial.nextLine();
    }


}
