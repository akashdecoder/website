package com.dynamics.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class PageController {


    @GetMapping("/dynamics")
    public String welcomePage(){
        return "index.html";
    }

    @GetMapping("/dynamics/aboutus")
    public String aboutPage(){
        return "about.html";
    }

    @GetMapping("/dynamics/portfolio")
    public String portfolioPage(){
        return "portfolio.html";
    }

    @GetMapping("/dynamics/project")
    public String projectPage(){
        return "project.html";
    }

    @GetMapping("/dynamics/events")
    public String eventPage(){
        return "events.html";
    }

//    @RequestMapping(value = "/dynamics/recruitment", method = RequestMethod.GET)
//    public String viewRegister(Model model) {
//
//        AppUserForm form = new AppUserForm();
//
//        model.addAttribute("appUserForm", form);
//
//        return "recruitment.html";
//    }
//
//    @RequestMapping(value = "/dynamics/recruitment", method = RequestMethod.POST)
//    public String saveRegister(Model model, //
//                               @ModelAttribute("appUserForm") @Validated AppUserForm appUserForm, //
//                               BindingResult result, //
//                               final RedirectAttributes redirectAttributes) {
//
//        // Validate result
//        if (result.hasErrors()) {
//            return "recruitment.html";
//        }
//        AppUser newUser= null;
//        try {
//            newUser = appUserDAO.createAppUser(appUserForm);
//        }
//        // Other error!!
//        catch (Exception e) {
//            model.addAttribute("errorMessage", "Error: " + e.getMessage());
//            return "recruitment.html";
//        }
//
//        redirectAttributes.addFlashAttribute("flashUser", newUser);
//
//        return "redirect:/dynamics";
//    }

    @GetMapping("/dynamics/team")
    public String teamPage(){
        return "team.html";
    }

    @GetMapping("/dynamics/contactus")
    public String contactusPage(){
        return "contactus.html";
    }
}
