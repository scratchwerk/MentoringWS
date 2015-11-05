package com.scratchwerk.mentoringws.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scratchwerk.mentoringws.models.Mentor;

@RestController
@RequestMapping("/crud")
public class CrudController {

	@RequestMapping(value="/mentor", method=RequestMethod.GET)
	public Mentor retrieveMentor(@RequestParam(value="id", defaultValue="0") int id) {
        return new Mentor(id, "Ronnie", "King");
    }
	
	@RequestMapping(value="/mentor", method=RequestMethod.PUT)
	public String createMentor(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just created a new Mentor";
    }
	
}