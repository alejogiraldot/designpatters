package creationaldesignpatterns.factory;

import org.springframework.stereotype.Component;

@Component
public class ValidateCreationUser {

    public User getTypeCreation(String typeUser) {
        if (typeUser.equals("admin")) {
            return new CreateAdminUser();
        } else if (typeUser.equals("user")) {
            return new CreateBasicUser();
        }
        return null;
    }
}
