package learn;

import learn.ProductNotFoundExeptions;

public class ExecptionsDemo {

	public static void main(String[] args) throws  ProductNotFoundExeptions{
		Int getAnEmployee = new EmployeeGetter();
		try {
			getAnEmployee.getEmploye();
		} catch (ProductNotFoundExeptions e) {
			throw new ProductNotFoundExeptions("tried twice "+e.getMessage());
		}
		
	}
}
interface Int {
	public void getEmploye() throws ProductNotFoundExeptions;
}
class EmployeeGetter implements Int{

	@Override
	public void getEmploye() throws ProductNotFoundExeptions {
		// connect to DB
		// get the employee/
		// read age of employee and store in int age
		int age=21;
		if (age<23){
			throw new ProductNotFoundExeptions("employee age less than 23");
		}
			
		
	}
	
}

