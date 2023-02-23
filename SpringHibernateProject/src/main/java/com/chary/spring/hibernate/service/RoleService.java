package com.chary.spring.hibernate.service;


import java.util.List;
import java.util.Optional;

import com.chary.spring.hibernate.entities.Role;



public interface RoleService {

	public Role saveRole(Role role);

	public List<Role> getRoles();

	public Optional<Role> getRoleById(int roleId);

	public String deleteRole(int roleId);

	public Role updateRole(Role role);

}