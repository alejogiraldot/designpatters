package creationaldesignpatterns.builder;

import com.designpatterns.designpatterns.DesignpatternsApplication;
import org.springframework.boot.SpringApplication;

public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignpatternsApplication.class, args);
        UserDto userDto = new UserDto.Builder()
                .email("alej@hotmail.com")
                .build();
    }

}
