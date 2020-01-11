package OOP;

public class WebMaster extends User {
    String www = "www.yandex.ru";


    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    WebMaster(String www) {
        this.www = www;
    }

    public String getInfo() {
        String s = super.getInfo();
        return s + "\nSite - " + www;
    }

    public static void main(String[] args) {
        User www=new WebMaster("vk.com");

        System.out.println(www.getInfo());
    }
}
