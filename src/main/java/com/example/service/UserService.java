package com.example.service;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repositories.RoleRepository;
import com.example.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

import com.example.entity.ERole;
import com.example.entity.RoleEntity;
import com.example.entity.UserEntity;
import com.example.entity.DTO.CreateUserDTO;

@Service
public class UserService {
	
	@Autowired 
	private final UserRepository userRepository;
	@Autowired 
	private final RoleRepository roleRepository;
	@Autowired 
	private final PasswordEncoder passwordEncoder;

	
     //lombok
    public UserService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    // Método que obtiene todos los usuarios
    @Transactional(readOnly = true)
    public List<UserEntity> findAll() {
        return (List<UserEntity>) userRepository.findAll();
    }
    

    // Método que obtiene un usuario por su ID
    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
    
    @Transactional
    public UserEntity createUser(CreateUserDTO createUserDTO) {
    	Set<RoleEntity> roles = createUserDTO.getRoles().stream()
                .map(role -> RoleEntity.builder()
                        .name(ERole.valueOf(role))
                        .build())
                .collect(Collectors.toSet());

        UserEntity userEntity = UserEntity.builder()
                .username(createUserDTO.getUsername())
                .password(passwordEncoder.encode(createUserDTO.getPassword()))
                .email(createUserDTO.getEmail())
                .roles(roles)
                .nombre(createUserDTO.getNombre())   
                .apellido(createUserDTO.getApellido()) 
                .build();

        return userRepository.save(userEntity);
    }


  //Método para actualizar usuario
    @Transactional
    public UserEntity updateUser(Long id, CreateUserDTO updateUserDTO) {
        UserEntity userToUpdate = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado por el id: : " + id));

        Set<RoleEntity> roles = updateUserDTO.getRoles().stream()
                .map(role -> RoleEntity.builder()
                        .name(ERole.valueOf(role))
                        .build())
                .collect(Collectors.toSet());

       
        userToUpdate.setNombre(updateUserDTO.getNombre());
        userToUpdate.setApellido(updateUserDTO.getApellido());
        userToUpdate.setUsername(updateUserDTO.getUsername());
        userToUpdate.setPassword(passwordEncoder.encode(updateUserDTO.getPassword()));
        userToUpdate.setEmail(updateUserDTO.getEmail());
        userToUpdate.setRoles(roles);

        return userRepository.save(userToUpdate);
    }
    
    //Método para borrar
    
    @Transactional
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }



}
