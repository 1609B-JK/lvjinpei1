package com.jk.controller.user;

import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by lvlv on 2017/5/25.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
}
