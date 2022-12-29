package com.kh.jdbc.day02.member.controller;

import java.util.List;

import com.kh.jdbc.day02.member.model.vo.Member;
import com.kh.jdbc.day02.member.model.vo.dao.MemberDAO;

public class MemberController {
	
	public List<Member> allMember(){
		MemberDAO mDAO = new MemberDAO();
		List<Member> mList = mDAO.memberAllSelect();
		return mList;
	}
	
	public Member oneMember(String info) {
		MemberDAO mDAO = new MemberDAO();
		Member mem = mDAO.memberOneId(info);
		return mem;		
	}
	
	public List<Member> multiMember(String info){
		MemberDAO memberDao = new MemberDAO();
		List<Member> mList = memberDao.multiMemberSelect(info);
		return mList;
	}

	public int registerMember(Member member) {
		MemberDAO memberDao = new MemberDAO();
		int result = memberDao.registerMember(member);
		return result;
	}
	
	public int updateMember(Member member) {
		MemberDAO memberDao = new MemberDAO();
		int result = memberDao.updateMember(member);
		return result;
	}
	
	public int removeMember(String id) {
		MemberDAO memberDao = new MemberDAO();
		int result = memberDao.removeMember(id);
		return result;
	}
}
