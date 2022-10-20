package paqueton;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.mongodb.*;
	//importamos los metodos del nuevo driver
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		/*
		System.out.println("En que base de datos quieres trabajar?");
		eleccionBase=sc.nextLine();
		*/
		try {
			MongoClient mongo1=new MongoClient("localhost",27017);
			DB db1=mongo1.getDB("fesac");
			JOptionPane.showMessageDialog(null, "1.Ver trabajadores");
			JOptionPane.showMessageDialog(null, "2.Insertar trabajadores");
			JOptionPane.showMessageDialog(null, "3.Ver alumnos");
			JOptionPane.showMessageDialog(null, "4.Insertar alumnos");
			JOptionPane.showMessageDialog(null, "5.Crear una coleccion");

			String eleccion=JOptionPane.showInputDialog("Que quieres hacer?");
			//crear colleccion
			DBCollection col1=db1.createCollection("trabajadores", null);
			
			//creacion de documentos
			BasicDBObject d1=new BasicDBObject("name","andres").append("codigo", 2901);
			BasicDBObject d2=new BasicDBObject("name","pedro").append("codigo", 2902);

			//escribimos en la db
			col1.insert(d1);
			col1.insert(d2);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
