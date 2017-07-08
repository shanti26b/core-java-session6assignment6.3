import hashcode.Student;
//implementing the hash code using an object

public class StudentDemo { 
	
	
	//here we creating another class and two objects to print the hash code 

	public static void main(String[] args) {  
		//of both them
		// TODO Auto-generated method stub
  Student uma = new Student();             // here we  the student objects,one object has uma and the other has shanthi
  Student shanthi =new Student();
  
  System.out.println("Hash code =" +uma.hashCode());  //here it prints the hashcodes of both of them
  System.out.println("Hash code =" +shanthi.hashCode());
	}

}
