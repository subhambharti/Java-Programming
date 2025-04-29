// 95.	Write a program to convert a JSON string to a Java object.

import com.google.gson.Gson;

class User {
    String name;
    int age;
}

public class JsonToObject {
    public static void main(String[] args) {
        String json = "{\"name\":\"Alice\", \"age\":25}";
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        System.out.println(user.name + " - " + user.age);
    }
}
