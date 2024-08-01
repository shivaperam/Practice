/*
import java.util.*;
class Best
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			if (n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}*/
//***COLLECTIONs FrameWork topics practicing ***
 
/*
import java.util.ArrayList;
class Emp<A,B,C>
{
	A rollno;
	B name;
	C salary;
	Emp(A rollno,B name,C salary){
		this.rollno=rollno;
		this.name=name;
		this.salary=salary;
	}
	public String toString(){
		return rollno+" "+name+" "+salary;
	}
}
class Best
{
	public static void main(String args[]){
		Emp<Integer,String,Float> e1=new Emp<>(101,"shiva",100.0f);
		Emp<Integer,String,Float> e2=new Emp<>(102,"jesus",200.0f);
		Emp<Integer,String,Float> e3=new Emp<>(103,"jesuscrist",300.0f);
		ArrayList<Emp<Integer,String,Float>> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
	}
}
*/
/*
import java.util.*;
class Best
{
	public static void main(String args[]){
		HashSet<Integer> hl=new HashSet<>();
		HashSet<String> h2=new HashSet<>();
		hl.add(10);
		hl.add(20);
		hl.add(30);
		hl.add(40);
		h2.add("siva");
		h2.add("siva");
		h2.add("sai");
		System.out.println(hl);
		System.out.println(h2);
	}
}
*/
/*
import java.sql.*;
class Best
{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","shiva");
			Statement stmt=con.createStatement();
			stmt.execute("create table emp(rolno number(3),name varchar2(10),marks number(3))");
			PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
			pst.setInt(1,Integer.parseInt(args[0]));
			pst.setString(2,args[1]);
			pst.setInt(3,Integer.parseInt(args[2]));
			pst.executeUpdate();
			System.out.println("one record inserted successfully");


		}catch(ClassNotFoundException|SQLException e){
			System.err.println(e);
		}
	}
}
*/
class Best
{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("");
		}
	}
}