package org.scoula.ex05.dto;

public class LoginDTO {
    private String name;
    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String name, String passwd) {
        this.name = name;
        this.password = passwd;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String password) {
        this.password = password;
    }
}
