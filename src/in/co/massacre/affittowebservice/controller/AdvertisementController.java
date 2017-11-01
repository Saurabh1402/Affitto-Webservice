package in.co.massacre.affittowebservice.controller;

import com.google.gson.Gson;
import com.sun.media.jfxmedia.logging.Logger;
import in.co.massacre.affittowebservice.service.interfaces.AdvertisementService;
import in.co.massacre.affittowebservice.model.Advertisement;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by saurabh on 31/10/17.
 */

@RestController
@RequestMapping(value="/advertisement")
public class AdvertisementController {
    @RequestMapping(value="/findAll",method= RequestMethod.GET,produces = "application/json")
    public String getFullIndex(String jsonArrayRequest){
        System.out.println("inside /getindexforall controller:");
        //        ApplicationContext ctx=new ClassPathXmlApplicationContext("//WEB-INF/applicationContext.xml");
        GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
        ctx.load("WEB-INF/applicationContext.xml");
        ctx.refresh();
        AdvertisementService advertisementService=ctx.getBean("jpaAdvertisementService",AdvertisementService.class);
        List<Advertisement> list= advertisementService.findAll();
        Logger.logMsg(Logger.INFO,"List<Advertisement>:" +list.size()+"");
        System.out.println("List<Advertisement>: "+list.size()+"");
        return new Gson().toJson(list);
    }


}
