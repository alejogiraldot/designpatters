package creationaldesignpatterns.factory;

public class CreateBasicUser implements User{
    @Override
    public void createUser() {
        System.out.println("Creating a new user");
    }

    @Override
    public void saveUser() {
        System.out.println("Saving a new user");
    }
}
