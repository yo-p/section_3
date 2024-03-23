package service;

import entity.Member;

import java.util.ArrayList;

public class MemberServiceImpl implements  MemberService{
    private  static MemberServiceImpl singlton = new MemberServiceImpl();
    private MemberServiceImpl() {};
    public static  MemberServiceImpl getInstance() {
        return singlton;
    }
    @Override
    public String greet(int i) {
        String[] greetings = {"Good morning", "Hello", "Good evening"};
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        Member member1 = new Member(1, "Linda", "linda@example.com");
        Member member2 = new Member(2, "James", "james@example.com");
        list.add(member1);
        list.add(member2);

        return list;
    }

    @Override
    public int sumOf(int start, int end) {
        int total = 0;
        for(int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }
}
