package simpleLib;
/**
 * 
 */
import java.util.ArrayList;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Student extends User {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	

	
	Student(int i, String n){
		super(i, n);
		this.loans = new ArrayList<Loan>();
		this.maxLoans = STUDENT_MAX_LOANS; 
	}
	
//	@Override
//	public String toString(){
//		return "Name: " + this.name + " Id: "+ this.id;
//	}
	
}