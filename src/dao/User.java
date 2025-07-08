package dao;

public class User {
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String type;

    public User(String id, String pw, String name, String tel, String type) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
        this.type = type;
    }

    public String getId() { return id; }
    public String getPw() { return pw; }

    @Override
    public String toString() {
        return "User{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", tel='" + tel + '\'' +
               ", type='" + type + '\'' +
               '}';
    }
}
