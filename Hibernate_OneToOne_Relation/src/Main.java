import entity.Laptop;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.List;

public class Main {
  public static void main(String[] args) {

    Laptop laptop_1 = new Laptop("L001","Hp");
    Laptop laptop_2 = new Laptop("L002","Acer");

    Session session = FactoryConfiguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();

            session.save(laptop_1);
            session.save(laptop_2);
            session.save(new Person("P001","Sonal","Ahangama",768563881,laptop_1));
            session.save(new Person("P002","Sithara","Galle",787310776,laptop_2));

    transaction.commit();
  }
}
