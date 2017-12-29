package com.assignstudent.etalon.beans;

import com.assignstudent.etalon.security.impl.CustomUser;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class UsersViewModel extends CustomUser {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;

    public UsersViewModel() {

    }


    public UsersViewModel(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
