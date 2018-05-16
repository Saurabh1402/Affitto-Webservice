package in.co.massacre.affittowebservice.utils;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

/**
 * Created by saurabh on 12/2/18.
 */
public class GoogleSocialLogin {
    public void signInAndroidClient(String idTokenString){
// Check that the ID Token is valid.

//        TokenStatus idStatus = new TokenStatus();
//        GoogleChecker checker = new GoogleChecker(new String[]{"362851981336-hebjfnkoen1ap91k9ji1lpp6qv2ql93d.apps.googleusercontent.com","362851981336-adrltc11bpmsa72nboi0o0mg2ta71ui6.apps.googleusercontent.com"}, "362851981336-adrltc11bpmsa72nboi0o0mg2ta71ui6.apps.googleusercontent.com");
//        GoogleIdToken.Payload jwt = checker.check(idTokenString);
//
//        if (jwt == null) {
//            // This is not a valid token.
//            idStatus.setValid(false);
//            idStatus.setId("");
//            idStatus.setMessage("Invalid ID Token.");
//        } else {
//            idStatus.setValid(true);
//            String gplusId = (String)jwt.get("sub");
//            idStatus.setId(gplusId);
//            idStatus.setMessage("ID Token is valid.");
//            System.out.println(jwt.getEmail());
//        }
        JacksonFactory jacksonFactory= JacksonFactory.getDefaultInstance();
        HttpTransport httpTransport = new NetHttpTransport();
        String server_client_id=PropertiesUtils.getProperties(AffittoConstant.SERVER_CLIENT_ID);
        System.out.println("Server_client_id: "+server_client_id);
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(httpTransport, jacksonFactory)
                .setAudience(Collections.singleton(
                        "362851981336-hebjfnkoen1ap91k9ji1lpp6qv2ql93d.apps.googleusercontent.com"
                ))
                .build();
        System.out.print("\nverifier is build succesful\n");
        GoogleIdToken idToken = null;
        try {
            idToken = verifier.verify(idTokenString);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (idToken != null) {
            GoogleIdToken.Payload payload = idToken.getPayload();

            // Print user identifier
            String userId = payload.getSubject();

            // Get profile information from payload
            String email = payload.getEmail();
            System.out.println("GoogleSocialLogin.signInAndroidClient().payload " + payload);
            boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
            String name = (String) payload.get("name");
            String pictureUrl = (String) payload.get("picture");
            String locale = (String) payload.get("locale");
            String familyName = (String) payload.get("family_name");
            String givenName = (String) payload.get("given_name");
            System.out.println("GoogleSocialLogin.signInAndroidClient().email " + email);
            System.out.println("GoogleSocialLogin.signInAndroidClient().name " + name);
            System.out.println("GoogleSocialLogin.signInAndroidClient().locale " + locale);
            System.out.println("GoogleSocialLogin.signInAndroidClient().familyName " + familyName);
            System.out.println("GoogleSocialLogin.signInAndroidClient().givenName " + givenName);

            // Use or store profile information
            // ...

        } else {
            System.out.println("Invalid ID token.");
        }
    }
    public static class TokenStatus {
        public boolean valid;
        public String gplus_id;
        public String message;

        public TokenStatus() {
            valid = false;
            gplus_id = "";
            message = "";
        }

        public void setValid(boolean v) {
            this.valid = v;
        }

        public void setId(String gplus_id) {
            this.gplus_id = gplus_id;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    /**
     * JSON response to verification request.
     *
     * Example JSON response:
     * {
     *   "id_token_status": {
     *     "info": "12345",
     *     "valid": True
     *   },
     *   "access_token_status": {
     *     "Access Token not meant for this app.",
     *     "valid": False
     *   }
     * }
     */
    public static class VerificationResponse {
        public TokenStatus id_token_status;
        public TokenStatus access_token_status;

        private VerificationResponse(TokenStatus _id_token_status, TokenStatus _access_token_status) {
            this.id_token_status = _id_token_status;
            this.access_token_status = _access_token_status;
        }

        public static VerificationResponse newVerificationResponse(TokenStatus id_token_status,
                                                                   TokenStatus access_token_status) {
            return new VerificationResponse(id_token_status,
                    access_token_status);
        }
    }
}
