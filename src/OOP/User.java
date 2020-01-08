package OOP;

public class User {
    protected int id;
    protected String login;
    protected String password;

    User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    User(){

    };


    public static void main(String[] args) {
        User[] man = new User[3];
        man[0]= new User(500408, "ABtank", "qweasd");
        man[1]= new User(500408, "AYtank", "135246");
        man[2] = new User();


        for (User M: man) {
            if(M.getLogin()==null){
                M.setId();
                M.setLogin();
                M.setPassword();
            }
            System.out.println("Login="+M.getLogin()+"\nid="+M.getId()+"\npassword="+M.getPassword()+"\n");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        this.id = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setLogin() {
        this.login = "guest";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword() {
        this.password = "";
    }

}