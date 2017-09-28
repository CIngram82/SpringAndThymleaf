package com.theironyard.charlotte.SpringAndThymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(path = "/new_student", method = RequestMethod.POST)
    public String newStudent(Model model) {
        model.addAttribute("grades", Grade.values()/* call the method on the Grade enum to get all the grades */);
        return "new_student";
    }

    @RequestMapping(path = "/create_student", method = RequestMethod.GET)
    public String createStudent(String firstName, String lastname, Grade grade , Model model) {
        Student student = new Student();


        /* set student firstName, lastName and grade using the http request parameters */

        /* add the student to the model that will be used by the view_student html file */

        return "view_student";
    }
}
