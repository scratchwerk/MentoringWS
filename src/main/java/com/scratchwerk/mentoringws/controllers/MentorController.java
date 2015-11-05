package com.scratchwerk.mentoringws.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scratchwerk.mentoringws.models.Mentor;

@RestController
@RequestMapping("/member")
public class MentorController {

	@RequestMapping("/mentor")
    public Mentor mentor(@RequestParam(value="id", defaultValue="0") int id) {
        return new Mentor(id, "Ronnie", "King");
    }
	
}
