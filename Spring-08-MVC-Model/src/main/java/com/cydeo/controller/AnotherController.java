package com.cydeo.controller;

import com.cydeo.model.Mentor;
import com.cydeo.utils.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class AnotherController {

    @RequestMapping("/list") //http://localhost:9090/mentor/list
    private String showMentorsTable(Model model) {

        List<Mentor> mentorsList = new ArrayList<>();
        mentorsList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorsList.add(new Mentor("Tom", "Hanks", 65, Gender.MALE));
        mentorsList.add(new Mentor("Amy", "Bryan", 25, Gender.FEMALE));

        model.addAttribute("mentors", mentorsList);


        return "/mentor/mentor-list";


    }

}
