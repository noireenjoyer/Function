package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalTask {
    public static void main(String[] args) {
        List<User> users = createUsers();
        displayUsers(users, user -> System.out.println("Name: " + user.getName() + ", Phone: " + user.getPhoneNumber()));
    }

    private static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("User1", "123-456-7890"));
        users.add(new User("User2", "987-654-3210"));
        users.add(new User("User3", "555-123-4567"));
        users.add(new User("User4", "777-888-9999"));
        users.add(new User("User5", "111-222-3333"));
        return users;
    }

    private static void displayUsers(List<User> users, Consumer<User> userConsumer) {
        for (User user : users) {
            userConsumer.accept(user);
        }
    }
}
