package myproject; 
import java.util.ResourceBundle;
public class app{ public int userlogin(String in_name,String in_id) {
	ResourceBundle rb=ResourceBundle.getBundle("config"); 
	String uname=rb.getString("in_name");
	String id=rb.getString("in_id");
	if(in_name.equals(uname)&& in_id.equals(id)) 
		return 1; 
	else 
		return 0;
	}
}