package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
	private String name;
	private String number;
	private String address;
	private String email;
	Scanner in = new Scanner(System.in);
	
	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}
	
	public PhoneBook(String name,String number,String address,String email) {
		this.name=name;
		this.number=number;
		this.address = address;
		this.email=email;
		
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "name=" + name + ", number=" + number + ", address=" + address + ", email=" + email;
	}
	
	PhoneBook userCreate(){
		System.out.println("Enter Name :");
		name=in.next();
		System.out.println("Enter number :");
		number=in.next();
		System.out.println("Enter address :");
		address=in.next();
		System.out.println("Enter email :");
		email=in.next();
		return new PhoneBook(name,number,address,email);
	}
	
	void userDisplay(List<PhoneBook> p){
		for(int i =0;i<p.size();i++){
			System.out.println((i+1)+"."+p.get(i).toString());
			
		}
		
	}
	
	void userEdit(List<PhoneBook> pl){
		PhoneBook p = new PhoneBook();
		p.userDisplay(pl);
		System.out.println("Select the User : 1-"+pl.size());
		int l = in.nextInt();
		boolean b = false;
		do{
			System.out.println("Select field \n1.Name \n2.Number \n3.Address \n4.Email");
			int m = in.nextInt();
			String s;
			switch(m){
			case 1:{
				 System.out.println("Enter new Name");
				 s=in.next();
				 pl.get(l-1).setName(s);
			 }break;
			case 2:{
				 System.out.println("Enter new Number");
				 s=in.next();
				 pl.get(l-1).setNumber(s);
			 }break;
			case 3:{
				 System.out.println("Enter new Address");
				 s=in.next();
				 pl.get(l-1).setAddress(s);
			 }break;
			case 4:{
				 System.out.println("Enter new Email");
				 s=in.next();
				 pl.get(l-1).setEmail(s);
			 }break;
			 default:System.out.println("Wrong option \nPlease try again");
			}
			System.out.println("Continue to edit field(y/n)");
			s=in.next();
			if(s.equalsIgnoreCase("y"))
				b=true;
			else
				b=false;
				
		}while(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		List<PhoneBook> pl = new ArrayList<PhoneBook>();
		pl.add(new PhoneBook("sasirekha" , "7386099422", "chennai", "sasirekha@gmail.com"));
		pl.add(new PhoneBook("purnima ", "7386022422"," banglore", "purni43@gmail.com"));
		pl.add(new PhoneBook("yashoda", "8389066223"," Andhra", "sudha12@gamil.com"));
		PhoneBook p = new PhoneBook();
		p.userDisplay(pl);
		int k=0;
		do{
			System.out.println("\nSelect the option \n1.New \n2.Modify \n3.Delete \n4.Display \n0.Exit");
			k=in.nextInt();
			switch(k){
				case 1:{
					pl.add(p.userCreate());
				}break;
				case 2:p.userEdit(pl);
				break;
				case 3:{
					p.userDisplay(pl);
					System.out.println("Select the User : 1-"+pl.size());
					int l = in.nextInt();
					pl.remove(l-1);
				}break;
				case 4:p.userDisplay(pl);
				break;
				case 0:System.exit(0);
				default:System.out.println("Wrong option \nPlease try again");
			}
		}while(k!=0);
		
	}

}
