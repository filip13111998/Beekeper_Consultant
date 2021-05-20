package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.NadmorskaVisinaService;
import com.example.model.NadmorskaVisina;



@RestController
public class NadmorskaVisinaController {

	
	private final NadmorskaVisinaService nvs;
	
	@Autowired
	public NadmorskaVisinaController(NadmorskaVisinaService ns) {
		this.nvs = ns;
	}
	
	
	@PostMapping(value = "/nvs", produces = "application/json")
	public NadmorskaVisina getNV(@RequestBody NadmorskaVisina nv) {

		NadmorskaVisina nv2 = nvs.changeHeight(nv);

		return nv2;
	}

		
}
