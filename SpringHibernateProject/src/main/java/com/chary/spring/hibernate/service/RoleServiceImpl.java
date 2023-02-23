package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chary.spring.hibernate.dao.RoleDao;
import com.chary.spring.hibernate.entities.Role;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	@Override
	public Role saveRole(Role role) {
		return roleDao.save(role);
	}

	@Override
	public List<Role> getRoles() {
		return (List<Role>) roleDao.findAll();
	}

	@Override
	public Optional<Role> getRoleById(int roleId) {
		return roleDao.findById(roleId);
	}

	@Override
	public String deleteRole(int roleId) {
		roleDao.deleteById(roleId);
		return "roleId removed successfully:"+roleId;
	}

	@Override
	public Role updateRole(Role role) {
		return roleDao.save(role);
	}

}
