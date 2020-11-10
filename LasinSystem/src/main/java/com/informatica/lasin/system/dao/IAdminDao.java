package com.informatica.lasin.system.dao;

import org.springframework.data.repository.CrudRepository;

import com.informatica.lasin.system.models.Admin;

public interface IAdminDao extends CrudRepository<Admin, Long>{

}
