package com.vkinsuschedule.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Andrew on 04.10.2016.
 */
@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getSchedule(ModelMap model) {
        return "Hello world!0)))00))";
    }

}
