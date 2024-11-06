package com.xworkz.Internal;

    public class Personn {
        // Private variables
        private String name;
        private int age;

        // Constructor
        public Personn(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        public static void main(String[] args) {
            Personn person = new Personn("Alice", 30);
            // Using getters to access private variables
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            // Using setters to modify private variables
            person.setName("Bob");
            person.setAge(35);

            // Again, using getters to access private variables
            System.out.println("Updated Name: " + person.getName());
            System.out.println("Updated Age: " + person.getAge());
        }
    }

