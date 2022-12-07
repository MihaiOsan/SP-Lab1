public class User {
    private String name;
    private int age;
    private String passport;

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof User)) {
            return false;
        }

        User c = (User) o;

        return name.equals(c.name) && age == c.age && passport.equals(c.passport);
    }
}
