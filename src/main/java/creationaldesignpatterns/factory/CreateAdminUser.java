package creationaldesignpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CreateAdminUser implements User {

    @Override
    public void createUser() {
        System.out.println("Creating Admin User");
    }

    @Override
    public void saveUser() {
        System.out.println("Saving Admin User");
    }
}
