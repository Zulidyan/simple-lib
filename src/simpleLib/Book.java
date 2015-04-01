package simpleLib;
/**
 * 
 */

import java.util.*;

/** 
 * <!-- begin-UML-doc -->
 * A Book is a subclass of Item which additionally contains a String ISBN and a integer number of pages.
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Book extends Item {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//Set<BookCopy> bookCopies;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	int numPages;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	String isbn;
	
	//book constructor
	Book(int id, String title, String author, Date publicationDate, String publisher, int copies, String i, int pages){
		super(id, title, author, publicationDate, publisher, copies);
		isbn = i;
		numPages = pages;
	}

	
	@Override
	public String toString(){
		return "Title: " + this.getTitle() + " Id: "+ this.getItemId() + " Author: " + this.getAuthor() +
				" Publication Date: " + this.getPublicationDate() + " Publisher: " + this.getPublisher() +
				" #copies: " + getNumCopies() + " ISBN: "+ this.isbn + " Pages: " + this.numPages;
	}
}