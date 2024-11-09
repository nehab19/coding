package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMap {

    static class User {
        private String name;
        private int age = 8;
        List<String> phoneNumbers;

        public User(String name) {
            this.name = name;
        }

        public User(String name, int age, List<String> phoneNumbers) {
            this.name = name;
            this.age = age;
            this.phoneNumbers = phoneNumbers;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }

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

        @Override
        public String toString() {
            return "name=" + name + " age=" + age;
        }
    }

    public static void main(String[] args) {
        List<User> users= Arrays.asList(new User("Bunny",28,Arrays.asList("1","2")), new User("Honey",20,Arrays.asList("4","5")));
        //Optional<String> userStream = users.stream().map(user -> user.getPhoneNumbers().stream()).flatMap(userPhone -> userPhone.filter(phone -> "5".equals(phone))).map(name->name.).findAny();
        Optional<String> usersStream = users.stream().filter(user -> user.getPhoneNumbers().stream().anyMatch(phone -> "5".equals(phone))).map(User::getName).findAny();
        usersStream.ifPresent(print-> System.out.println(print));
       /* userStream.ifPresent(print-> System.out.println(print));*/

    }
}
