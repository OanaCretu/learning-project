package allFriendsGroupId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SecretSantaService {
    private FriendService friendService = new FriendService();
    private List<Friend> allFriends = friendService.getAllFriends();

    public Map<String, String> generateRandomFriend() {
        Map<String, String> assignedNamesMap = new HashMap<>();
        Random random = new Random();
        allFriends.forEach(friend -> {
            List<String> friendNames = friendService.getChooseableNames(friendService.getFamilyName(friend.getName()));
            //remove the ones already assigned
            friendNames.removeAll(assignedNamesMap.values());
            int randomIndex = random.nextInt(friendNames.size());
            assignedNamesMap.put(friend.getName(), friendNames.get(randomIndex));
        });
        return assignedNamesMap;
    }
}
