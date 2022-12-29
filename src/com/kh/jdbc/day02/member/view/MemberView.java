package com.kh.jdbc.day02.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.jdbc.day02.member.model.vo.Member;

public class MemberView {
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보수정");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 프로그램 종료");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === 전체 멤버 리스트 === === ===");
		for(Member mem : mList){
			System.out.println(mem.toString());
		}
	}
	
	public void showOneMember(Member member) {
		System.out.println("=== === === 정보출력 === === ===");
		System.out.println(member.toString());
	}
	
	public String inputMemberInfo(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회 할 " + message + " 입력 : ");
		String id = sc.next();
		return id;
	}
	
	public Member fixmemberId() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.print("변경 할 정보가 있는 아이디 입력 : ");
		String memberId = sc.next();
		System.out.print("변경 하실 비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("변경 하실 메일주소 : ");
		String memberEmail = sc.next();
		System.out.print("변경 하실 전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("변경 하실 주소 : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("변경 하실 취미 : ");
		String memberHobby = sc.next();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;
	}
	
	public Member register() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 입력 : ");
		String memberPwd = sc.next();
		System.out.print("이름 입력 :");
		String memberName = sc.next();
		System.out.print("성별 입력(남,여로 입력) :");
		String memberGender = sc.next();
		System.out.print("나이 입력 : ");
		int memberAge = sc.nextInt();
		System.out.print("이메일 입력 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 입력 : ");
		String memberPhone = sc.next();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("취미 입력 : ");
		String memberHobby = sc.next();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberGender(memberGender);
		member.setMemberAge(memberAge);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;	
	}
	
	public String remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하실 아이디를 입력해주세요 : ");
		String id = sc.next();
		return id;
	}
	
	public void print(String message) {
		System.out.println(message);
	}
	
	
	
	
	
}
