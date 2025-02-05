package Tests.Domain;


import java.util.Scanner;

public class TokenT {
    private int testId;
    private String projectName;
    private String branchName;
    private String date;
    private Type[] types;

    public void insertTokenInfosInitial(){
        Scanner inputInitial = new Scanner(System.in);

        System.out.println("--- Digite o nome do projeto ---");
        String inputProjectName = inputInitial.nextLine();
        System.out.println("-- Digite o nome da sua branch --");
        String inputBranchName = inputInitial.nextLine();
        System.out.println("- Digite a data de hoje -");
        String inputDate = inputInitial.nextLine();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Type[] getTypes() {
        return types;
    }

    public void setTypes(Type[] types) {
        this.types = types;
    }
}
