package simpleLib;
/**
 * 
 */

import java.util.Date;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ConferenceProceeding extends Book {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String conf_location;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date conf_date;
	
	ConferenceProceeding(int id, String title, String author, Date publicationDate, 
			String publisher, int copies, String i, int pages, String cl, Date cd){
		super(id, title, author, publicationDate, publisher, copies, i, pages);
		conf_location = cl;
		conf_date = cd;
	}
}