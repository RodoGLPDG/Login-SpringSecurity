	package com.example.repositories;
	
	import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.ERole;
import com.example.entity.RoleEntity;
	
	public interface RoleRepository extends CrudRepository<RoleEntity, Long>{
	
		Optional<RoleEntity> findByName(ERole role);
	}
