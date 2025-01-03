package dao;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String size;

    public static class Builder {
        private Person person;

        public Builder() {
            person = new Person();
        }

        public Builder withName(String name) {
            person.name = name;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Builder withWeight(int weight) {
            person.weight = weight;
            return this;
        }

        public Builder withHeight(int height) {
            person.height = height;
            return this;
        }

        public Builder withSize(String size) {
            person.size = size;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
