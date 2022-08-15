package ua.kiev.prog;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Groups1")
public class Group {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy="group", cascade=CascadeType.ALL)
    private List<Contact> contacts = new ArrayList<Contact>();

    public Group() {}

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
