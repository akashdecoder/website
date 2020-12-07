package com.dynamics.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventPageController {
    @GetMapping("/dynamics/events/coding")
    public String codingEventPage(){
        return "codingevent.html";
    }

    @GetMapping("/dynamics/events/robotics")
    public String roboticsEventPage(){
        return "robotics.html";
    }

    @GetMapping("/dynamics/events/workshop")
    public String workshopPage(){
        return "workshop.html";
    }

    @GetMapping("/dynamics/events/hackathon")
    public String hackathonPage(){
        return "hackathon.html";
    }
}
