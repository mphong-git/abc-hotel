package view;

import java.util.Scanner;

import abc_hotel.Result;
import abc_hotel.Util;

public class PageUser {

	public Util u;
	public Scanner scanner;
	Result res = new Result();
	
	public PageUser(Util u, Scanner scanner) {
		
		this.u = u;
		this.scanner = scanner;
	}
	
	
	public Result pageUserLogin() {
		
		u.prtPageDiv();
		u.prtln("");
		u.prt("아이디 : ");
		res.id = scanner.nextLine();
		u.prt("비밀번호 : ");
		res.pw = scanner.nextLine();
		u.prtln("");
		u.prtln("  1. 로그인");
		u.prtln("  2. 이전");
		u.prtln("");
		u.prt("  선택 : ");

		res.selno = scanner.nextLine();

        if(res.selno.equals("1")) { res.page = "procUserLogin"; }
        else if(res.selno.equals("2")) { res.page = "SelectLogin"; }
        else { 
        	res.page = "UserLogin";
        	u.prtln("오류메세지 : 잘못된 메뉴입니다");
        }        
        
        
        u.prt_log(" " + res.selno);
        
        return res;
		
	}	

	
	
	public Result pageUserMenu() {
		
		u.prtPageDiv();
		u.prtln("");
		u.prtln("  1. 호텔 검색");
		u.prtln("  2. 마이 페이지");
		u.prtln("  3. 로그아웃");
		u.prtln("");
		u.prt("  선택 : ");

		res.selno = scanner.nextLine();

        if(res.selno.equals("1")) { res.page = "HotelFind"; }
        else if(res.selno.equals("2")) { res.page = "MyPage"; }
        else if(res.selno.equals("3")) { res.page = "SelectLogin"; }
        else { 
        	res.page = "UserMenu";
        	u.prtln("오류메세지 : 잘못된 메뉴입니다");
        }        
        
        u.prt_log(" " + res.selno);
        
        return res;
		
	}	
	
}
