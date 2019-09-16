package com.wonders.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fyw on 2019-9-16
 *
 * @author fyw
 */
@Controller
public class SpringbootTemplateController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
