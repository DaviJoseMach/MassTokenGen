package Tests.ExecuteClient;

import Tests.Domain.DecoToken;

public class TokenTestBreakExecute {
    public static void main(String[] args) {
        DecoToken breakToken = new DecoToken();

        breakToken.insertToken();
        breakToken.breakToken();
    }
}
