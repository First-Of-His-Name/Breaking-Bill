package DBSchema;

import java.util.Map;

/**
 * Created by Aman on 23/05/17.
 */

public class ListStructure {

    String listName, owner;
    long timestampCreated, timestampLastUpdated;
//    Map<String, ListMemberStructure> members;
//    Map<String, ExpenseStructure> expenses;

    public ListStructure() {

    }

    public ListStructure(String listName, String owner, long timestampCreated, long timestampLastUpdated) {
        this.listName = listName;
        this.owner = owner;
        this.timestampCreated = timestampCreated;
        this.timestampLastUpdated = timestampLastUpdated;
    }


//    public ListStructure(String listName, String owner, long timestampCreated, long timestampLastUpdated, Map<String, ExpenseStructure> expenses) {
//        this.listName = listName;
//        this.owner = owner;
//        this.timestampCreated = timestampCreated;
//        this.timestampLastUpdated = timestampLastUpdated;
//        this.expenses = expenses;
//    }

//    public ListStructure(String listName, String owner, long timestampCreated, long timestampLastUpdated, Map<String, ListMemberStructure> members) {
//        this.listName = listName;
//        this.owner = owner;
//        this.timestampCreated = timestampCreated;
//        this.timestampLastUpdated = timestampLastUpdated;
//        this.members = members;
//    }
//
//    public ListStructure(String listName, String owner, long timestampCreated, long timestampLastUpdated, Map<String, ListMemberStructure> members, Map<String, ExpenseStructure> expenses) {
//        this.listName = listName;
//        this.owner = owner;
//        this.timestampCreated = timestampCreated;
//        this.timestampLastUpdated = timestampLastUpdated;
//        this.members = members;
//        this.expenses = expenses;
//    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }

    public long getTimestampCreated() {
        return timestampCreated;
    }

    public long getTimestampLastUpdated() {
        return timestampLastUpdated;
    }

//    public Map<String, ListMemberStructure> getMembers() {
//        return members;
//    }
//
//    public Map<String, ExpenseStructure> getExpenses() {
//        return expenses;
//    }
}

