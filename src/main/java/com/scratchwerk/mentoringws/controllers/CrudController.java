package com.scratchwerk.mentoringws.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scratchwerk.mentoringws.models.Mentor;

@RestController
@RequestMapping("/crud")
public class CrudController {

	//Mentor Paths
	@RequestMapping(value="/mentor", method=RequestMethod.GET)
	public Mentor retrieveMentor(@RequestParam(value="id", defaultValue="0") int id) {
        return new Mentor(id, "Ronnie", "King");
    }
	
	@RequestMapping(value="/mentor", method=RequestMethod.POST)
	public String createMentor(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just created a new Mentor";
    }
	
	@RequestMapping(value="/mentor", method=RequestMethod.PUT)
	public String updateMentor(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just updated a new Mentor";
    }
	
	@RequestMapping(value="/mentor", method=RequestMethod.DELETE)
	public String deleteMentor(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just deleted a new Mentor";
    }
	
	//Mentee Paths
	@RequestMapping(value="/mentee", method=RequestMethod.GET)
	public Mentor retrieveMentee(@RequestParam(value="id", defaultValue="0") int id) {
        return new Mentor(id, "Ronnie", "King");
    }
	
	@RequestMapping(value="/mentee", method=RequestMethod.POST)
	public String createMentee(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just created a new Mentee";
    }
	
	@RequestMapping(value="/mentee", method=RequestMethod.PUT)
	public String updateMentee(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just updated a new Mentee";
    }
	
	@RequestMapping(value="/mentee", method=RequestMethod.DELETE)
	public String deleteMentee(@RequestParam(value="id", defaultValue="0") int id) {
        return "You just deleted a new Menteer";
    }
	
}