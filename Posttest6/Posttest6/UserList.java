package Posttest6;

public class UserList {
    private static Akun[] users = {
        new UserImpl("user1", "password1"),
        new UserImpl("user2", "password2")
    };
    
    public static Akun[] getUsers() {
        return users;
    }
    
    public static boolean authenticate(String username, String password) {
        for (Akun user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}