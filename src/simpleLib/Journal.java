package simpleLib;
/**
 * 
 */

import java.util.*;

/** 
 * <!-- begin-UML-doc -->
 * Journal is a subclass of Item containing additional attributes volume and issueNumber, which are integers containing the volume number and issue Number of the journal.
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Journal extends Item {

	
	Journal(int id, String title, String author, Date publicationDate, String publisher, int copies, int vol, int issue){
		super(id, title, author, publicationDate, publisher, copies);
		volume = vol;
		issueNumber= issue;
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//private Set<JournalCopy> journalCopy;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int volume;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int issueNumber;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//private ShortLoan shortLoan;
	
	public String toString(){
		return "Title: " + this.getTitle() + " Id: "+ this.getItemId() + " Author: " + this.getAuthor() +
				" Publication Date: " + this.getPublicationDate() + " Publisher: " + this.getPublisher() +
				" #copies: " + getNumCopies() + " Volume: "+ this.volume + " Issue: " + this.issueNumber;
	}
}