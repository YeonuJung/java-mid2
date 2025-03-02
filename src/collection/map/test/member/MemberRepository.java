package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    Map<String, Member> memberData = new HashMap<>();

    public void save(Member member) {
        memberData.put(member.getId(), member);
    }

    public Member findById(String id) {
        return memberData.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberData.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void remove(String id) {
        memberData.remove(id);
    }
}
