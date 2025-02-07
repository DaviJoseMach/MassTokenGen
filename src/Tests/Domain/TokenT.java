package Tests.Domain;

import java.util.Scanner;

public class TokenT {
    private String[][] types = {
            {"chore", "1"},
            {"docs", "2"},
            {"feat", "3"},
            {"fix", "4"},
            {"refactor", "5"},
            {"style", "6"},
            {"test", "7"}
    };
    private int testId;
    private String projectName;
    private String branchName;
    private String date;
    private String selectedTypes = "";

    public TokenT(int testId) {
        this.testId = testId;
    }

    public void insertTokenInfosInitial() {
        Scanner input = new Scanner(System.in);
        boolean checkValidString;

        do {
            System.out.println("--- Enter the project name ---");
            this.projectName = input.nextLine();
            System.out.println("-- Enter your branch name --");
            this.branchName = input.nextLine();
            System.out.println("- Enter today's date -");
            this.date = input.nextLine();

            checkValidString = this.projectName == null || this.projectName.isEmpty() ||
                    this.branchName == null || this.branchName.isEmpty() ||
                    this.date == null || this.date.isEmpty();

            if (checkValidString) {
                System.out.println("⚠️ You did not fill in all the parameters. Please try again.");
            }
        } while (checkValidString);
    }


    public void typeInsert() {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Enter the changes (comma-separated) ---");
        String inputType = input.nextLine();
        String[] inType = inputType.split(",");
        StringBuilder typesString = new StringBuilder();

        for (String type : inType) {
            type = type.trim();
            String typeNumber = getTypeNumber(type);
            if (typeNumber == null) {
                System.out.println("❌ Invalid type: " + type);
            } else {
                typesString.append(typeNumber);
            }
        } this.selectedTypes = typesString.toString();
    }

    private String getTypeNumber(String type) {
        for (String[] entry : types) {
            if (entry[0].equals(type)) {
                return entry[1];
            }
        }  return null;
    }

    public void returnToken() {
        if (selectedTypes.isEmpty()) {
            System.out.println("⚠️ No valid types were entered.");
            return;
        } String token = selectedTypes + "(" + projectName + ":" + branchName + ")" + this.date;
        System.out.println("\n---- 🎟️ Your token ----\n" + token);
    }
}
