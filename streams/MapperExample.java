package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {
    static class User {
        private String name;
        private int age=8;

        public User(String name) {
            this.name = name;
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
        List<String> names = Arrays.asList("Bunny", "Naina", "Laila");
        List<User> users = names.stream().filter(name -> !name.equals("Neha")).map(name -> new User(name)).collect(Collectors.toList());
        int sum=users.stream().mapToInt(user->user.getAge()).sum();
        System.out.println("Sum : "+sum);
        System.out.println(users);
    }
}
