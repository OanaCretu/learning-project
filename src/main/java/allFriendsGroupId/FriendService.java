package allFriendsGroupId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FriendService {

  public List<Friend> getAllFriends() {
    List<Friend> allFriends = new ArrayList<>();
    allFriends.add(
        new Friend(
            FriendEnum.Oana.name(), FriendEnum.Oana.getEmail(), FriendEnum.Oana.isAssigned()));
    allFriends.add(
        new Friend(FriendEnum.Sil.name(), FriendEnum.Sil.getEmail(), FriendEnum.Sil.isAssigned()));
    allFriends.add(
        new Friend(FriendEnum.Ema.name(), FriendEnum.Ema.getEmail(), FriendEnum.Ema.isAssigned()));
    allFriends.add(
        new Friend(FriendEnum.Ana.name(), FriendEnum.Ana.getEmail(), FriendEnum.Ana.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Luky.name(), FriendEnum.Luky.getEmail(), FriendEnum.Luky.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Bobo.name(), FriendEnum.Bobo.getEmail(), FriendEnum.Bobo.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Nina.name(), FriendEnum.Nina.getEmail(), FriendEnum.Nina.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Mambo.name(), FriendEnum.Mambo.getEmail(), FriendEnum.Mambo.isAssigned()));
    allFriends.add(
        new Friend(FriendEnum.Ale.name(), FriendEnum.Ale.getEmail(), FriendEnum.Ale.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Septi.name(), FriendEnum.Septi.getEmail(), FriendEnum.Septi.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Anastasia.name(),
            FriendEnum.Anastasia.getEmail(),
            FriendEnum.Anastasia.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Lucas.name(), FriendEnum.Lucas.getEmail(), FriendEnum.Lucas.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Ramona.name(),
            FriendEnum.Ramona.getEmail(),
            FriendEnum.Ramona.isAssigned()));
    allFriends.add(
        new Friend(
            FriendEnum.Dragos.name(),
            FriendEnum.Dragos.getEmail(),
            FriendEnum.Dragos.isAssigned()));
    allFriends.add(
        new Friend(FriendEnum.Edi.name(), FriendEnum.Edi.getEmail(), FriendEnum.Edi.isAssigned()));
    allFriends.add(
        new Friend(FriendEnum.Mia.name(), FriendEnum.Mia.getEmail(), FriendEnum.Mia.isAssigned()));
    return allFriends;
  }

  public static List<Friend> getAllUnassignedFriends(List<Friend> friends) {
    return friends.stream().filter((s) -> !s.isAssigned()).collect(Collectors.toList());
  }

  public static Map<String, List<Friend>> getFamilies() {
    Map<String, List<Friend>> familiesMap = new HashMap<>();

    List<Friend> famCretu = new ArrayList<>();
    famCretu.add(
        new Friend(
            FriendEnum.Oana.name(), FriendEnum.Oana.getEmail(), FriendEnum.Oana.isAssigned()));
    famCretu.add(
        new Friend(FriendEnum.Sil.name(), FriendEnum.Sil.getEmail(), FriendEnum.Sil.isAssigned()));
    famCretu.add(
        new Friend(FriendEnum.Ema.name(), FriendEnum.Ema.getEmail(), FriendEnum.Ema.isAssigned()));
    famCretu.add(
        new Friend(FriendEnum.Ana.name(), FriendEnum.Ana.getEmail(), FriendEnum.Ana.isAssigned()));
    familiesMap.put("Cretu", famCretu);

    List<Friend> famBucevschiB = new ArrayList<>();
    famBucevschiB.add(
        new Friend(
            FriendEnum.Luky.name(), FriendEnum.Luky.getEmail(), FriendEnum.Luky.isAssigned()));
    famBucevschiB.add(
        new Friend(
            FriendEnum.Bobo.name(), FriendEnum.Bobo.getEmail(), FriendEnum.Bobo.isAssigned()));
    famBucevschiB.add(
        new Friend(
            FriendEnum.Nina.name(), FriendEnum.Nina.getEmail(), FriendEnum.Nina.isAssigned()));
    famBucevschiB.add(
        new Friend(
            FriendEnum.Mambo.name(), FriendEnum.Mambo.getEmail(), FriendEnum.Mambo.isAssigned()));
    familiesMap.put("BucevschiB", famBucevschiB);

    List<Friend> famCernat = new ArrayList<>();
    famCernat.add(
        new Friend(FriendEnum.Ale.name(), FriendEnum.Ale.getEmail(), FriendEnum.Ale.isAssigned()));
    famCernat.add(
        new Friend(
            FriendEnum.Septi.name(), FriendEnum.Septi.getEmail(), FriendEnum.Septi.isAssigned()));
    famCernat.add(
        new Friend(
            FriendEnum.Anastasia.name(),
            FriendEnum.Anastasia.getEmail(),
            FriendEnum.Anastasia.isAssigned()));
    famCernat.add(
        new Friend(
            FriendEnum.Lucas.name(), FriendEnum.Lucas.getEmail(), FriendEnum.Lucas.isAssigned()));
    familiesMap.put("Cernat", famCernat);

    List<Friend> famBucevschiD = new ArrayList<>();
    famBucevschiD.add(
        new Friend(
            FriendEnum.Ramona.name(),
            FriendEnum.Ramona.getEmail(),
            FriendEnum.Ramona.isAssigned()));
    famBucevschiD.add(
        new Friend(
            FriendEnum.Dragos.name(),
            FriendEnum.Dragos.getEmail(),
            FriendEnum.Dragos.isAssigned()));
    famBucevschiD.add(
        new Friend(FriendEnum.Edi.name(), FriendEnum.Edi.getEmail(), FriendEnum.Edi.isAssigned()));
    famBucevschiD.add(
        new Friend(FriendEnum.Mia.name(), FriendEnum.Mia.getEmail(), FriendEnum.Mia.isAssigned()));
    familiesMap.put("BucevschiD", famBucevschiD);

    return familiesMap;
  }

  public String getFamilyName(String friendName) {
    Map<String, List<Friend>> familiesMap = getFamilies();

    return familiesMap.entrySet().stream()
        .filter(
            (entry) ->
                entry.getValue().stream()
                    .anyMatch(friend -> friend.getName().equalsIgnoreCase(friendName)))
        .findFirst()
        .orElseThrow(
            () ->
                new RuntimeException(
                    String.format("Family name not found for provided name: %s!", friendName)))
        .getKey();
  }

  public List<String> getAllNames() {
    List<String> allNames = new ArrayList<>();

    for (FriendEnum friendEnum: FriendEnum.values()) {
      allNames.add(friendEnum.name());
    }

    return allNames;
  }

  //all names except the ones from the same family
  public List<String> getChooseableNames(String famName) {
    List<String> chooseableNames = new ArrayList<>();
    Map<String, List<Friend>> familiesMap = getFamilies();
    familiesMap.remove(famName);

    familiesMap.forEach((familyName, famMembers) -> {
      famMembers.forEach(famMember -> chooseableNames.add(famMember.getName()));
    });

    return chooseableNames;
  }
}
