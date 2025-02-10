package creationaldesignpatterns.factory;



public class CreationUserApplication {
    public static void main(String[] args) {
        ValidateCreationUser validateCreationUser = new ValidateCreationUser();
        User user = validateCreationUser.getTypeCreation("admin");
        user.createUser();
        user.saveUser();

        User basicUser = validateCreationUser.getTypeCreation("user");
        basicUser.createUser();
        basicUser.saveUser();
    }
}
