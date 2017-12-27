package com.marshallingunmarshalling.MarshallingUnMarshalling;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * Mintu Choudhary
 * JAXB stands for Java Architecture for XML Binding. It provides a mechanism to write Java objects into XML and read XML as objects
 *
 *
 *output: It shall create a file : data withxmlcontent.xml at D drive
 *
 *<?xml version="1.0" encoding="UTF-8" standalone="yes"?><student id="11380"><name>Mintu</name><subject>java</subject></student>
 */
public class MarshallerMain {
	public static void main(String[] args) {

		try {
			// creating the JAXB context
			JAXBContext jContext = JAXBContext.newInstance(Student.class);
			
			// creating the marshaller object
			Marshaller marshallObj = jContext.createMarshaller();
			
			// setting the property to show xml format output
			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			// setting the values in POJO class			
			Student student = new Student("Mintu", 11380, "java");
			
			// calling the marshall method
			marshallObj.marshal(student, new FileOutputStream("D:/datawithxmlcontent.xml"));
			System.out.println("Please check file created at D drive ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
