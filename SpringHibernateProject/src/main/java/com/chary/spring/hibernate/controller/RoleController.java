package com.chary.spring.hibernate.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chary.spring.hibernate.entities.Role;
import com.chary.spring.hibernate.service.RoleService;


@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createRole")
	public Role createRole(@RequestBody Role role) throws Exception
	{
		return roleService.saveRole(role);
	}
    
	@GetMapping("/selectRole")
	public List<Role> getAllRole() throws Exception
	{
		return roleService.getRoles();
	}
	
	@GetMapping("/selectRole/{roleId}")
	public Optional<Role> getRoleById(@PathVariable int roleId)throws Exception
	{
		return roleService.getRoleById(roleId);
	}
    
	
	@DeleteMapping("/deleteRole/{roleId}")
	public String deleteRole(@PathVariable int roleId)throws Exception
	{
		return roleService.deleteRole(roleId);
	}
    
	
	@PutMapping("/updateRole")
	public Role updateRole(@RequestBody Role role) throws Exception
	{
		return roleService.updateRole(role);
	}

	
	
	
	
	

}