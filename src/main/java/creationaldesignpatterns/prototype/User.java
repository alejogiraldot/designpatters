package creationaldesignpatterns.prototype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class User implements UserInterface {
    private String name;
    private String surname;

    @Override
    public UserInterface cloneUser() {
        User user = null;

        try {
            user = (User) clone();
        } catch (CloneNotSupportedException e) {
            log.info("there was an error creating the object clone");
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
