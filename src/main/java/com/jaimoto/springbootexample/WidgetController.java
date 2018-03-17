package com.jaimoto.springbootexample;

import com.jaimoto.springbootexample.vo.Widget;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WidgetController {

    //@RequestMapping(name = "/api",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @RequestMapping(value = "/api",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index(){
        return new Widget("Green",10,7);
    }
}
