package DBSchema;

/**
 * Created by Aman on 26/05/17.
 */

public class SharedListStructure {

    String listName, listKey;

    public SharedListStructure() {
    }

    public SharedListStructure(String listName, String listKey) {
        this.listName = listName;
        this.listKey = listKey;
    }

    public String getListName() {
        return listName;
    }

    public String getListKey() {
        return listKey;
    }
}
