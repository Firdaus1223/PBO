package Posttest6;

public class AdminList {
        private static Akun[] users = {
            new UserImpl("admin", "admin123")
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
