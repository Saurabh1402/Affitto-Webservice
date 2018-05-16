package in.co.massacre.affittowebservice.utils;

/**
 * Created by saurabh on 17/2/18.
 */

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;


public class GoogleChecker {

    private final List mClientIDs;
    private final String mAudience;
    private final GoogleIdTokenVerifier mVerifier;
    private final JacksonFactory mJFactory;
    private String mProblem = "Verification failed. (Time-out?)";

    public GoogleChecker(String[] clientIDs, String audience) {
        System.out.println("GoogleChecker.GoogleChecker():  start");
        mClientIDs = Arrays.asList(clientIDs);
        mAudience = audience;
        NetHttpTransport transport = new NetHttpTransport();
        mJFactory = new JacksonFactory();
        mVerifier = new GoogleIdTokenVerifier(transport, mJFactory);
        System.out.println("GoogleChecker.GoogleChecker():  end");
    }

    public GoogleIdToken.Payload check(String tokenString) {
        GoogleIdToken.Payload payload = null;
        try {
            GoogleIdToken token = GoogleIdToken.parse(mJFactory, tokenString);
            if (mVerifier.verify(token)) {
                GoogleIdToken.Payload tempPayload = token.getPayload();
                if (!tempPayload.getAudience().equals(mAudience))
                    mProblem = "Audience mismatch";
                else if (!mClientIDs.contains(tempPayload.getAuthorizedParty()))
                    mProblem = "Client ID mismatch";
                else
                    payload = tempPayload;
            }
        } catch (GeneralSecurityException e) {
            mProblem = "Security issue: " + e.getLocalizedMessage();
        } catch (IOException e) {
            mProblem = "Network problem: " + e.getLocalizedMessage();
        }
        return payload;
    }

    public String problem() {
        return mProblem;
    }
}