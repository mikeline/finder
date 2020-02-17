import java.util.*;

public class Finder
{
    public static Set<String> getOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        groups.forEach(g -> {
            g.getMembers().forEach(m -> {
                if (m.getAge() > targetAge)
                {
                    groupsNames.add(m.getName());
                }
            });
        });
        return groupsNames;
    }
}