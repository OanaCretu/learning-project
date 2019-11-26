package allFriendsGroupId;

public class Friend {
    private String name;
    private String email;
    private boolean isAssigned;


    public Friend(String name, String email, boolean isAssigned) {
        this.name = name;
        this.email = email;
        this.isAssigned = isAssigned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }
}
