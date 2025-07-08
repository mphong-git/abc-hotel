package view;

import java.util.Scanner;

import abc_hotel.Result;
import abc_hotel.Util;

public class PageCommon {

	public Util u;
	public Scanner scanner;
	public Result res = new Result();
	
	public PageCommon(Util u, Scanner scanner) {
		
		this.u = u;
		this.scanner = scanner;
	}
	
	
	
	public Result pageSeleteLogin() {
		
		
		
		u.prtPageDiv();
		u.prtln("****************************************");
		u.prtln("*                                      *");
		u.prtln("* Hotel 예약                           *");
		u.prtln("*                                      *");
		u.prtln("****************************************");
		u.prtln("");
		u.prtln("  1. 일반 회원 로그인");
		u.prtln("  2. 기업회원 로그인");
		u.prtln("  3. 회원가입");
		u.prtln("  4. 종료");
		u.prtln("");
		u.prt("  선택 : ");

        res.selno = scanner.nextLine();

        if(res.selno.equals("1")) { res.page = "UserLogin"; }
        else if(res.selno.equals("2")) { res.page = "BizLogin"; }
        else if(res.selno.equals("3")) { res.page = "MemberReg"; }
        else if(res.selno.equals("4")) { res.page = "Exit"; }
        else { res.page = "Exit"; }
        
        
        u.prt_log(" " + res.selno);
		
        
        return res;
		
	}	
	
}
