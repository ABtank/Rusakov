package OOP;

public class UserSoial extends User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    UserSoial(int id, String login,String password, String name, int age) {
        super(id,login,password);
        this.name=name;
        this.age=age;
    }


    public String getInfo() {
        String s = super.getInfo();
        return s + "\nname:" + name + "\nage=" + age;
    }

    public static void main(String[] args) {
        UserSoial Us =new UserSoial(12,"lo","qwerty","Bayby",23);
        System.out.println(Us.getInfo());

        User web = new WebMaster("www.google.com");

        System.out.println(web.getInfo());
    }
}
