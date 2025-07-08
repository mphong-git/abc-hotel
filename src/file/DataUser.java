package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.User;

public class DataUser {
    private List<User> userList = new ArrayList<>();

    public void loadUsers(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        reader.readLine(); // 첫 줄은 헤더니까 건너뜀
        
        
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(",");
            if (tokens.length == 5) {
                
            	
            	User user = new User(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
                
               
                
                userList.add(user);
            }
        }

        reader.close();
        
        return;
    }
    
    public User findUser(String id, String pw) {
        for (User user : userList) {
            if (user.getId().equals(id) && user.getPw().equals(pw)) {
                return user;
            }
        }
        return null;
    }
    
    
    
    
    
}