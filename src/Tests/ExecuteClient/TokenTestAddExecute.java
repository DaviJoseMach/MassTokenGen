package Tests.ExecuteClient;

import Tests.Domain.TokenT;


public class TokenTestAddExecute {
    public static void main(String[] args) {
    TokenT token = new TokenT(1);
    token.insertTokenInfosInitial();  token.typeInsert(); token.returnToken();
    }
}
