package in.co.massacre.affittowebservice.controller;


import in.co.massacre.affittowebservice.utils.GoogleSocialLogin;
import org.springframework.web.bind.annotation.*;

/**
 * Created by saurabh on 9/2/18.
 */
@RestController
@RequestMapping(value="/login")
public class SignInController {

    @RequestMapping(value = "/signInWithGoogle/client/android",method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    String loginWithGoogle(@RequestParam String idTokenString){
        GoogleSocialLogin googleSocialLogin=null;
        System.out.println("SignInController.loginWithGoogle().idTokenString= "+idTokenString);
        new GoogleSocialLogin().signInAndroidClient(idTokenString);
        return "Hello World";
    }
    @RequestMapping(value = "/signInWithGoogle/client/android/successful/{authCode}",method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    String loginSuccessfulWithGoogle(@PathVariable("autCode") String authCode){
        return "Hello World 2";
    }

}
