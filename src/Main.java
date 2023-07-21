import java.util.List;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        User firstUser = new User("Bill", "Thomas", 35, "thomas@mail.ua");
        User secondUser = new User("Charlie", "Hunnam", 43, "hunnem@gmail.com");
        User thurdUser = new User("Ron", "Perlman", 73, "perlman@ukr.net");
        User fourthUser = new User("Maggie", "Siff", 49, "siff@mail.ru");
        User fifthUser = new User("Tommy", "Flanagan", 58, "flanagan@gmail.com");
        User sixthUser = new User("Barbara", "Flanagan", 56, "flanagan@gmail.com");
        List<User> users = List.of(firstUser, secondUser, thurdUser, fourthUser, fifthUser, sixthUser);
        users.stream()
                .sorted()
                .map(User::getSurname)
                .distinct()
                .forEach(System.out::println);
        System.out.println();
        Optional<String> op = users.stream()
                .filter(surname -> surname.getSurname().length() < 8)
                .map(User::getName)
                .findAny();
        try{
            System.out.println(op.orElseThrow(() -> new NotFoundValueException("Wasn't find any value")));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        System.out.println();
        users.stream()
                .filter(email -> email.getEmail().length() > 14)
                .map(User::getAge)
                .skip(3)
                .forEach(System.out::println);

    }
}