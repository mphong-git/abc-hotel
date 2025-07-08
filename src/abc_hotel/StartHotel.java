package abc_hotel;

import java.util.List;
import java.util.Scanner;

import control.ProcUser;
import dao.User;
import file.DataUser;
import view.PageCommon;
import view.PageUser;

public class StartHotel {

	public List<User> listUSER= null;
	
	public Util u = new Util();
	public Scanner scan = new Scanner(System.in); // Scanner 객체 생성
	
	
	public DataUser dUser = new DataUser();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StartHotel sh = new StartHotel();
		
		try {
			sh.procMain();
		} catch(Exception e) {
			
		} finally {
			sh.scan.close();
		}
	}

	
	public void procMain() {
		
		dataLoad();
		
		PageCommon pComm = new PageCommon(u, scan);
		PageUser   pUser = new PageUser(u, scan);
		
		ProcUser   cUser = new ProcUser(u);
		
		
		Result res = new Result();
		res.page = "SelectLogin";
		
		while(res.page.equals("Exit") == false) {
			u.prt_log("paae : " + res.page);
			
			if(res.page.equals("SelectLogin")) {
				//u.prt_log("call pComm.pageSeleteLogin()");
				res = pComm.pageSeleteLogin();
			
			} else if(res.page.equals("UserLogin")) {
				//u.prt_log("call pUser.pageUserLogin()");
				res = pUser.pageUserLogin();
			
			} else if(res.page.equals("procUserLogin")) {
				//u.prt_log("call procUserLogin");
				res = cUser.procUserLogin(res, dUser);

			} else if(res.page.equals("UserMenu")) {
				//u.prt_log("call pUser.pageUserMenu()");
				res = pUser.pageUserMenu();
				
			} else {
				u.prtln("오류메세지 : 잘못된 메뉴로 프로그램 종료합니다");
				break;
			}
			
		}
		
		u.prt("Goodbye...");
		
	
	}
	
	
	
	public void dataLoad() {
		
		try {
			dUser.loadUsers("D:/WS-ec-2024-06/sm_hotel/data/user.txt");
		

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}	
	

	

	

	
	
}
