package DBSchema;

/**
 * Created by Aman on 25/05/17.
 */

public class SharedMemberStructure {

    String name, email;

    public SharedMemberStructure() {

    }

    public SharedMemberStructure(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
