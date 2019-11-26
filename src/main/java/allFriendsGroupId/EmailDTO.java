package allFriendsGroupId;

public class EmailDTO {

    private String forFriendName;
    private String toEmailAddress;
    private String assignedFriend;

    public void setForFriendName(String forFriendName) {
        this.forFriendName = forFriendName;
    }

    public void setToEmailAddress(String toEmailAddress) {
        this.toEmailAddress = toEmailAddress;
    }

    public void setAssignedFriend(String assignedFriend) {
        this.assignedFriend = assignedFriend;
    }

    public String getForFriendName() {
        return forFriendName;
    }

    public String getToEmailAddress() {
        return toEmailAddress;
    }

    public String getAssignedFriend() {
        return assignedFriend;
    }
}
