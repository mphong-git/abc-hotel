package control;

import abc_hotel.Result;
import abc_hotel.Util;
import dao.User;
import file.DataUser;

public class ProcUser {

	public Util u;
	public Result res = new Result();
	
	public ProcUser(Util u) {
		this.u = u;
	}	
	
	public Result procUserLogin(Result res, DataUser dUser) {
		
		User user = dUser.findUser(res.id, res.pw);
		
		u.prt_log("login : " + user);

        if(res.selno.equals("1")) {  }
        else if(res.selno.equals("2")) { res.page = "SelectLogin"; }
        else { res.page = "UserLogin"; }   		
		
		if(user != null) {
			res.page = "UserMenu";
			res.user = user;
		} else {
			res.page = "UserLogin";
			u.prtln("오류메세지 : 아이디 또는 비밀번호가 잘못되었습니다");
		}
		
		return res;
		
		
		
		
	}
	
	
}
