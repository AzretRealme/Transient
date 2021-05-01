import com.google.gson.Gson;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setFirstName("Azret");
        user.setLastName("Urmatbekov");
        user.setEmail("azretovichh@email.com");
        user.setBirthDate(LocalDate.of(1998, 7, 16));
        user.setLogin("AzreTT");
        user.setPassword("password");

        Gson gson = new Gson();
        System.out.println("Initial user before transient : " + user + "\n");
        String phoneJson = gson.toJson(user);
        System.out.println("Initial user after transient : " + phoneJson +"\n");





    }
}
