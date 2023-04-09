package Posttest6;

class UserImpl implements Akun {
    private String username;
    private String password;
    
    public UserImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}