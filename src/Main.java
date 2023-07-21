import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        User firstUser = new User("Bill", "Thomas", 35, "thomas@mail.ua");
        User secondUser = new User("Charlie", "Hunnam", 43, "hunnem@gmail.com");
        User thurdUser = new User("Ron", "Perlman", 73, "perlman@ukr.net");
        User fourthUser = new User("Maggie", "Siff", 49, "siff@mail.ru");
        User fifthUser = new User("Tommy", "Flanagan", 58, "flanagan@gmail.com");
        List<User> users = List.of(firstUser, secondUser, thurdUser, fourthUser, fifthUser);
        users.forEach(System.out::println);
    }
}