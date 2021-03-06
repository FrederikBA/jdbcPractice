package Domain;

public class Member {
    private int id;
    private String firstName;
    private String lastName;

    public Member(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " - " + firstName + " " + lastName;
    }
}
