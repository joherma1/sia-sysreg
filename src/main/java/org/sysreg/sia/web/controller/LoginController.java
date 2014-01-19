package org.sysreg.sia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jose on 19/01/14.
 */
@Controller
public class LoginController {

    @RequestMapping({ "/login.html" })
    public String login()
    {
        return "login";
    }

}
