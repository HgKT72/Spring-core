package hello.core.member;

import java.util.HashMap;
import java.util.Map;


/**
 * 초기 개발용 임시 저장소
 */
public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long,Member> store=new HashMap<>();


    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);//해쉬 맵에서 key를 통해 Member 객체 반환
    }
}
