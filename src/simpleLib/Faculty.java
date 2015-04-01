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
public class Faculty extends User {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	
	Faculty(int i, String n){
		super(i, n);
		this.loans = new ArrayList<Loan>();
		this.maxLoans = FACULTY_MAX_LOANS; 
	}
	
//	@Override
//	public String toString(){
//		return "Name: " + this.name + " Id: "+ this.id;
//	}
}