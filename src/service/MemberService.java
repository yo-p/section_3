package service;

import entity.Member;

import java.util.ArrayList;

public interface MemberService {
    String greet(int i);
    ArrayList<Member> getAll();
    int sumOf(int start, int end);
}
