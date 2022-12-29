package com.kh.jdbc.day02.member.run;

import com.kh.jdbc.day02.member.controller.MemberController;
import com.kh.jdbc.day02.member.model.vo.Member;
import com.kh.jdbc.day02.member.view.MemberView;

public class MemberRun {
	public static void main(String[] args) {
		MemberView mView = new MemberView();
		MemberController mCon = new MemberController();
		Member member = null;
		int result = 0;
		goodbye :
		while(true) {
			int choice = mView.mainMenu();
			switch(choice) {
			case 0 : break goodbye;
			case 1 : 
				mView.showAllMember(mCon.allMember());
				break;
			case 2 : 
				String info = mView.inputMemberInfo("아이디");
				member = mCon.oneMember(info);
				mView.showOneMember(member);
				break;
			case 3 : 
				mView.showAllMember(mCon.multiMember(mView.inputMemberInfo("이름")));	
				break;
			case 4 : 
				member = mView.register();
				result = mCon.registerMember(member);
				if(result != 0) {
					mView.print("회원가입 성공!");
				}else {
					mView.print("회원가입에 실패했습니다");
				}
				break;
			case 5 : 
				if(mCon.updateMember(mView.fixmemberId()) != 0) {
					mView.print("정보수정 성공!");
				}else {
					mView.print("정보수정에 실패했습니다.");
				}
				break;
			case 6 : 
				String id = mView.remove();
				result = mCon.removeMember(id);
				if(result != 0) {
					mView.print("회원탈퇴 성공");
				}else mView.print("회원탈퇴 실패");
				break;
			default : break;
			}
		}
	}
}
