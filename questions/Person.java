/*
package guru.springframework.spring5webapp.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Person {
    private int value;
    private String identifier;
    private int level;

    public Person(int level, String identifier, int value) {
        this.value = value;
        this.identifier = identifier;
        this.level = level;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "A", 1));
        personList.add(new Person(2, "B", 2));
        personList.add(new Person(1, "C", 3));
        personList.add(new Person(2, "D", 4));
        personList.add(new Person(1, "A", 0));
        personList.add(new Person(2, "B", 0));
        personList.add(new Person(1, "A", 0));
        personList.add(new Person(2, "B", 0));
        personList.add(new Person(3, "C", 0));
        personList.add(new Person(2, "C", 0));
        personList.add(new Person(1, "C", 0));
        int i=0;
        int j=0;
        Set<Integer> result = new HashSet<>();
        int count = 0;
        while (j < personList.size()) {
            if (personList.get(i).getLevel() < personList.get(j).getLevel()) {
                if (personList.get(j).getValue() == 0 && personList.get(i).getValue() == 0) {
                    count++;
                    j++;
                } else {
                    count = 0;
                    i++;
                    j++;
                }
            } else {
                if (count != 0) {
                    while (i != j - 1) {
                        result.add(i);
                        i++;
                        count--;
                    }
                    result.add(i);
                    count = 0;
                } else {
                    i++;
                    j++;
                }

            }
        }
        if (count != 0) {
            while (i != j - 1) {
                result.add(i);
                i++;
                count--;
            }
            result.add(i);
        }
        System.out.println(result);
    }
}

    }
}*/
