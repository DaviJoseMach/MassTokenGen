package Tests.Domain;

import java.util.Scanner;

public class DecoToken {
    private String[][] types = {
            {"chore", "1"},
            {"docs", "2"},
            {"feat", "3"},
            {"fix", "4"},
            {"refactor", "5"},
            {"style", "6"},
            {"test", "7"}
    };
    private String token;
    private String projectName;
    private String branchName;
    private String date;

    public void insertToken(){
        Scanner input = new Scanner(System.in);
        System.out.println("🧾 Insert your token:");
        token = input.nextLine();
    }

    public void breakToken() {
        if (token == null || !token.contains("(") || !token.contains(")")) {
            System.out.println("❌ Invalid token format");
            return;
        }


        int parenStart = token.indexOf("(");
        String typeNumbers = token.substring(0, parenStart);
        String projectInfo = token.substring(parenStart + 1, token.indexOf(")"));
        String date = token.substring(token.indexOf(")") + 1);


        String[] projectParts = projectInfo.split(":");
        if (projectParts.length != 2) {
            System.out.println("❌ Invalid project/branch format");
            return;
        }
        projectName = projectParts[0];
        branchName = projectParts[1];

        StringBuilder decodedTypes = new StringBuilder();
        for (char num : typeNumbers.toCharArray()) {
            String typeName = getTypeName(String.valueOf(num));
            if (typeName != null) {
                decodedTypes.append(typeName).append(", ");
            }
        }
        if (decodedTypes.length() > 0) {
            decodedTypes.setLength(decodedTypes.length() - 2);
        }


        System.out.println("\n🔍 Token Breakdown:");
        System.out.println("🛠 Types: " + decodedTypes);
        System.out.println("📂 Project Name: " + projectName);
        System.out.println("🌿 Branch Name: " + branchName);
        System.out.println("📅 Date: " + date);
    }

    private String getTypeName(String number) {
        for (String[] entry : types) {
            if (entry[1].equals(number)) {
                return entry[0];
            }
        }
        return null;
    }


}
