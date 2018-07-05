package com.example.springdemo;




import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//HelloWorldController class will publish all web service end points
// Handles requests for the Greeting

@Controller
public class DemoControlller {

    private static final String template = "Hello, %s!";

    @RequestMapping (value = "/op", method = RequestMethod.POST )
    public @ResponseBody Greeting acceptRequest(@RequestBody Greeting gre) throws Exception{
        //gre.setName(gre.getName());

        return new Greeting(String.format(template, gre.getName()));

    }

}