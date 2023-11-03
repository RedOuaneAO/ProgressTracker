package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "objective")
public class Objective {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String description;
    @Enumerated(EnumType.STRING)
    private State state;
    @ManyToOne
    private  User user;

    public Objective(User user) {
        this.user = user;
    }

    public Objective(int id, String description, State state, User user) {
        this.id = id;
        this.description = description;
        this.state = state;
        this.user = user;
    }

    public Objective() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", state=" + state +
                ", user=" + user +
                '}';
    }
}
