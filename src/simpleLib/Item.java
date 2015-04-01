package simpleLib;
/**
 * 
 */

import java.util.*;

/** 
 * <!-- begin-UML-doc -->
 * A generic document found within a Library. All Items have an author, title, ID, publisher, publication date, and number of available copies.
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Item {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//public Catalogue items;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String author;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String title;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date publicationDate;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String publisher;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//ItemCopy itemCopy;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//Loan loan;
	
	private int itemId;
	
	private int numCopies; //available copies of the item in the library
	
	Item(int id, String t, String a, Date pd, String pub, int n){
		itemId = id;
		title = t;
		author = a;
		publicationDate= pd;
		publisher = pub;
		numCopies = n;
	}
	
	int getItemId(){
		return itemId;
	}
	
	String getTitle(){
		return title;
	}
	
	String getAuthor(){
		return author;
	}
	
	Date getPublicationDate(){
		return publicationDate;
	}
	
	String getPublisher(){
		return publisher;
	}
	
	int getNumCopies(){
		return numCopies;
	}
	
	void setNumCopies(int n){
		this.numCopies = n;
	}
	
	/**
	 * Checks to see if a particular item is unavailable in the library, ie numCopies == 0.
	 * @return numCopies == 0
	 */
	boolean isUnavailable(){
		return numCopies == 0;
	}
	//subtract the number of item copies by one
	/**
	 * Reduce the number of available copies by one
	 */
	void decrementCopies(){
		int c;
		c = getNumCopies();
		setNumCopies((c -= 1));
	}
	
	/**
	 * Increase the number of available copies by one.
	 */
	void incrementCopies(){
		int c;
		c = getNumCopies();
		setNumCopies((c += 1));
	}
	
	
	@Override
	public String toString(){
		return "Title: " + this.title + " Id: "+ this.itemId + " Author: " + this.author +
				" Publication Date: " + this.publicationDate + " Publisher: " + this.publisher;
	}
	
	
}