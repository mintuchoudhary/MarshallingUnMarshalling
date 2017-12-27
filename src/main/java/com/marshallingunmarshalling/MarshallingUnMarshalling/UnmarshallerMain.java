package com.marshallingunmarshalling.MarshallingUnMarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerMain {

	public static void main(String args[]) {
		try {
			// getting the xml file to read
			File file = new File("D:/datawithxmlcontent.xml");

			// creating the JAXB context
			JAXBContext jContext = JAXBContext.newInstance(Student.class);

			// creating the unmarshall object
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();

			// calling the unmarshall method
			Student student = (Student) unmarshallerObj.unmarshal(file);
			System.out.println("After unmarshalling xml data to java object");
			System.out.println("Name: "+ student.getName() + " Id:" + student.getId() + " Subject:" + student.getSubject());
		} catch (

		Exception e)

		{
			e.printStackTrace();
		}

	}
}
