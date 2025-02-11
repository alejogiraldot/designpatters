package creationaldesignpatterns.prototype;

public class UserApp {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Alejandro");
        User userClone = (User) user.cloneUser();
        System.out.println(userClone.getName());
        System.out.println(userClone.getName());
    }
}
