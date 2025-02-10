package creationaldesignpatterns.builder;


public class UserDto {
    private final String name;
    private final String email;
    private final String password;
    private final String phone;
    private final String address;

    public UserDto(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private String email;
        private String password;
        private String phone;
        private String address;

        public UserDto.Builder name(String name) {
            this.name = name;
            return this;
        }

        public UserDto.Builder email(String email) {
            this.email = email;
            return this;
        }

        public UserDto.Builder password(String password) {
            this.password = password;
            return this;
        }

        public UserDto.Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserDto.Builder address(String address) {
            this.address = address;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }
}
