package paqueton;
import java.util.Collection;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.mongodb.*;
	//importamos los metodos del nuevo driver
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			MongoClient mongo1=new MongoClient("localhost",27017);
			DB db1=mongo1.getDB("test");
			
			db1.getCollectionNames().forEach(System.out::println);
			
			DBCollection collection = db1.getCollection("coches");
		
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("potencia", 200);
			
			BasicDBObject finder = new BasicDBObject();
			
			
			DBCursor cursor = collection.find(searchQuery);
			
			while (cursor.hasNext()) {
			    System.out.println(cursor.next());
			    DBObject cabesa=cursor.next();
			    //cabesa.get("precio");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
