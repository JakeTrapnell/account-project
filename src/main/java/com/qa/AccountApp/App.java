package com.qa.AccountApp;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
	static Service service = new Service();
	
    public static void main( String[] args )
    {
    	Account person1 = service.makeAccount("Dave","Smith",34);
    	Account person2 = service.makeAccount("Penny","Apple",27);
    	Account person3 = service.makeAccount("Tyler","Super",51);
    	
    	System.out.println(service.findbyId(1, service.map).getFirstName());
    	System.out.println(service.findbyId(1, service.map).getLastName());
    	System.out.println(service.findbyId(1, service.map).getAccountNum());
    	
    	Gson gson = new Gson();
    	String json = gson.toJson(service);
    	System.out.println(json);
    	
    }
}
