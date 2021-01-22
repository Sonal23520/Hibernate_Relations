import entity.Laptop;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Session session = FactoryConfiguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();

    //      Laptop laptop_1 = new Laptop();
    //      laptop_1.setId("L001");
    //      laptop_1.setName("Hp");
    //
    //      Laptop laptop_2 = new Laptop();
    //      laptop_2.setId("L002");
    //      laptop_2.setName("Acer");
    //
    //      Person person = new Person();
    //      person.setId("P001");
    //      person.setName("Sonal");
    //      person.setAddress("Ahanagama");
    //      person.setPhone(768563881);
    //
    //      laptop_1.setPerson(person);
    //      laptop_2.setPerson(person);
    //
    //      ArrayList<Laptop> laptops = new ArrayList<>();
    //      laptops.add(laptop_1);
    //      laptops.add(laptop_2);
    //
    //      person.setLaptops(laptops);
    //
    //      session.save(laptop_1);
    //      session.save(laptop_2);
    //      session.save(person);

    //    Query query = session.createQuery("select p.id,p.name,p.address,l.id,l.name from Person p
    // inner join Laptop l on p.id=l.person.id");
    //    List<Object[]> list = query.list();
    //    for (Object[] objects : list) {
    //      System.out.println(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]+"
    // "+objects[4]);
    //    }



    transaction.commit();
  }
}
