package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    private String id;
    private String name;
    @ManyToOne
    private
    Person person;

    public Laptop() {
    }

    public Laptop(String id, String name, Person person) {
        this.id = id;
        this.name = name;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
