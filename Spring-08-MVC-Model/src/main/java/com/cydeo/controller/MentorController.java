package com.cydeo.controller;

import com.cydeo.model.Mentor;
import com.cydeo.utils.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/list")
    private String homePage(Model model) {

        List<Mentor> showMentorsTable = new ArrayList<>();
        showMentorsTable.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        showMentorsTable.add(new Mentor("Tom", "Hanks", 65, Gender.MALE));
        showMentorsTable.add(new Mentor("Amy", "Bryan", 25, Gender.FEMALE));

        model.addAttribute("mentors", showMentorsTable);


        return "/mentor/mentor-list";


    }

}
