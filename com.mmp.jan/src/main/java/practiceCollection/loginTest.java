package practiceCollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest {

	@Test(dataProvider="DP")
	public void validateLogin(String uname,String pword)
	{
		String s;
		System.out.println("DB Values: " + uname);
		System.out.println("DB Values:"  + pword);
//		WebDriverManager.chromeDriver.setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		driver.findElement(By.id("")).sendKeys(uname);
//		driver.findElement(By.id("")).sendKeys(pword);
//		driver.findElement(By.id("")).click();
		
	}
	@DataProvider(name="DP")
	public String[][] feedDP() throws ClassNotFoundException, SQLException
	{
		String data[][]=getDBValues("root","password","testdbjan","localhost","Select * from testdbjan.patient");
		return data;
	}
	
	
	public String[][] getDBValues(String uname,String pword,String dbname,String hostip,String selQuery) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		/*
		 * url a database url of the form jdbc:subprotocol:subnameuser 
		 * the database user on whose behalf the connection is being madepassword 
		 * the user's password
		 */
		String url="jdbc:mysql://localhost:3306/testdbjan";
		String username="root";
		String pwd="password";
		
		Connection con = DriverManager.getConnection(url, username, pwd);
		
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		//let me try with execute method instead of int  value = stmt.executeUpdate("INSERT INTO `testdb`.`login` VALUES ('selenium','selenium123#');");
		
		//int  value = stmt.executeUpdate("INSERT INTO `testdbjan`.`patient` VALUES ('selenium','selenium123#');");
		//System.out.println("The rows are upated "+ value);
		
		ResultSet rs =  stmt.executeQuery(selQuery);
		rs.last();
		int rows = rs.getRow();
		System.out.println("Number of rows " + rows);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		System.out.println("Number of cols: "+ cols);
		
		String data[][]= new String[rows][cols];
		int i=0;
		rs.beforeFirst();
		while(rs.next())
		{
			for(int j=0;j<cols;j++)
			{
				data[i][j]=rs.getString(j+1);
				System.out.println(data[i][j]);
			}
			i++;
		}	
		return data;
	}
}



