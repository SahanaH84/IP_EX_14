package ip14;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
@WebService(serviceName = "ip14server")
public class ip14server {

        @WebMethod(operationName = "getDetails")
    public String getDetails(@WebParam(name = "id") int id) {
        String s="";
        int p=0;
        String d="";
        try{
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/product");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from products where product_id="+id);
            while(rs.next()){
                if(rs.getInt(1)==id){
                    s=rs.getString(2);
                    p=rs.getInt(3);
                    d=rs.getString(4);
                    break;
                            }
                
            }
            
        }
        catch(Exception e){
            
        }
        if(s!=null && p!=0 && d!=null){
                return "Product:"+ s +"\n"+"Price:"+Integer.toString(p)+"\n"+"Description:"+d ;
            }
            else{
                return "no data found";
            }
    }
}
