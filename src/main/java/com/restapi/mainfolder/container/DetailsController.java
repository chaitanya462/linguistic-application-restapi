package com.restapi.mainfolder.container;

import java.util.*;
import java.io.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.mainfolder.exception.ResourceNotFoundException;
import com.restapi.mainfolder.model.Details;
import com.restapi.mainfolder.repository.DetailsRep;






@RestController
@CrossOrigin(origins="*")
@RequestMapping("/details")
public class DetailsController {
	
	
	@Autowired
	private DetailsRep rep;
	
	
	
	@GetMapping("/")
	public List<Details> getDetails()
	{
		return this.rep.findAll();
		
	}
	
	@PostMapping("/insert")
	public Details insertDetails( @RequestBody Details details)
	{
		this.rep.save(details);
		return details;
	}
	
	@DeleteMapping("/delete/{id}") 
	public Map<String,Boolean> deleteEmployee(@PathVariable(value ="id") Long employeeId ) throws ResourceNotFoundException
	  {
		
		Details details = rep.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee with the name is not found"));
		this.rep.delete(details);
		Map<String ,Boolean> res = new HashMap<>();
		res.put("delete",Boolean.TRUE);
		return res;
				
		
		
	}
	@GetMapping("/session/{id}")
	public ResponseEntity<Details> getEmployee(@PathVariable (value="id") 	Long employeeid) throws ResourceNotFoundException
	{
		 Details detail = rep.findById(employeeid).orElseThrow(()->new ResourceNotFoundException("record not found"));
		 return ResponseEntity.ok().body(detail);
				 
	}
	

}
