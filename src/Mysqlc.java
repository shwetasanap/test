import java.sql.*;
public class Mysqlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		String f1,f2,f3;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wtl","root","");
			if(!con.isClosed())
			{
				System.out.println("connected");
			}
			String query="select * from signup";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				f1=rs.getString(1);
				f2=rs.getString(2);
				f3=rs.getString(3);
				System.out.println(f1+" "+f2+" "+f3);
			}
		}
			catch(Exception e)
			{
				System.err.println("Exception"+ e.getMessage());
				
			}
			finally
			{
				try
				{
					if(con!=null)
					{
						con.close();
					}
				}
				catch(SQLException e) {
					
				}
			}
		}
	}



