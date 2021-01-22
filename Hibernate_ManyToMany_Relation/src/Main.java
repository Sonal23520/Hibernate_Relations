import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.lang.reflect.Field;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Session session = FactoryConfiguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();

    //    Laptop laptop_1 = new Laptop();
    //    laptop_1.setId("L001");
    //    laptop_1.setName("Hp");
    //
    //    Laptop laptop_2 = new Laptop();
    //    laptop_2.setId("L002");
    //    laptop_2.setName("Acer");
    //
    //    Person person_1 = new Person();
    //    person_1.setId("P001");
    //    person_1.setName("Sonal");
    //    person_1.setAddress("Ahangama");
    //    person_1.setPhone(768563881);
    //
    //    Person person_2 = new Person();
    //    person_2.setId("P002");
    //    person_2.setName("Sithara");
    //    person_2.setAddress("Galle");
    //    person_2.setPhone(787310776);
    //
    //    ArrayList<Laptop> laptops = new ArrayList<>();
    //    laptops.add(laptop_1);
    //    laptops.add(laptop_2);
    //    person_1.setLaptops(laptops);
    //    person_2.setLaptops(laptops);
    //
    //    ArrayList<Person> persons = new ArrayList<>();
    //    persons.add(person_1);
    //    persons.add(person_2);
    //    laptop_1.setPersons(persons);
    //    laptop_2.setPersons(persons);
    //
    //    session.save(laptop_1);
    //    session.save(laptop_2);
    //    session.save(person_1);
    //    session.save(person_2);



    transaction.commit();
  }
}
