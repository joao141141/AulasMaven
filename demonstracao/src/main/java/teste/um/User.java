package teste.um;

public class User {

    private String username;
    private String password;

    private StatusUser status;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }


    public StatusUser getStatus(){
        return this.status;
    }

    public void disable(){
        this.status = StatusUser.DISABLED;
    }

    public void enable(){
        this.status = StatusUser.ENABLED;
    }

}
