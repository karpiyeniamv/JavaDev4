package com.assignstudent.etalon.security.impl;

import com.assignstudent.etalon.beans.UsersViewModel;
import com.assignstudent.etalon.entities.UserEntity;
import com.assignstudent.etalon.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersService usersService;

    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {

        List<UserEntity> userEntities = usersService.findUserByUserName(username);

        if (userEntities.size() != 1) {
            throw new UsernameNotFoundException("Username not found");
        }
        UserEntity userEntity = userEntities.get(0);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(userEntity.getRole()));
        return buildUserForAuthentication(userEntity, authorities);

    }

    private CustomUser buildUserForAuthentication(UserEntity userEntity, List<GrantedAuthority> authorities) {
        UsersViewModel userViewModel = new UsersViewModel(userEntity.getUsername(), userEntity.getPassword(), authorities);
        userViewModel.setFirstName(userEntity.getFirstname());
        userViewModel.setLastName(userEntity.getLastname());
        userViewModel.setUserId(String.valueOf(userEntity.getId()));
        userViewModel.setEmail(userEntity.getEmail());
        return userViewModel;
    }


}
