public class UserBuilderDirector {

    public static User getUser1() {
        return new User.Builder("ben", "pass", 1).build();
    }
}