package cs5800m3;

public class EmployeeProducer {   
		   
		public static Employee getEmployee(boolean rounded){   
		      if(rounded){
		         return new Programmer();         
		      }else{
		         return new Manager();
		      }
		   }
}