package org.launchcode.mygallery.models.dto;

//written by Jen Buck
public class UserRegistrationFormDTO extends LoginFormDTO{

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
