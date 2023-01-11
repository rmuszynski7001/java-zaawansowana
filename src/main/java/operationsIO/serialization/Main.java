package operationsIO.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Robert", "Meme");

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/person");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/person");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        var personFromFile = (Person) objectInputStream.readObject();

        System.out.println(personFromFile.getName());
        System.out.println(personFromFile.getSurname());

    }
}
