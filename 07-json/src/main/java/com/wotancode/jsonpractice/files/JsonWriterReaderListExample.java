package com.wotancode.jsonpractice.files;

import com.wotancode.jsonpractice.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWriterReaderListExample {

    public static void main(String[] args) {

        Person person = new Person("Juan", 25, true);

        Gson gson = new Gson();

        List<Person> people = new ArrayList<>();

        try (FileReader reader = new FileReader("person.json")){
            Type listType = new TypeToken<List<Person>>() {}.getType();
            people = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for(Person person1: people){
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is student: " + person1.isStudent());
            System.out.println("______________________________");
        }

        people.add(new Person("Fernando Gabriel", 35, false));

        try (FileWriter writer = new FileWriter("person.json")){
            gson.toJson(people, writer);
            System.out.println("La persona fue guarda con éxito!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("person.json")){
            Type listType = new TypeToken<List<Person>>() {}.getType();
            people = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for(Person person1: people){
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is student: " + person1.isStudent());
            System.out.println("______________________________");
        }

    }
}

