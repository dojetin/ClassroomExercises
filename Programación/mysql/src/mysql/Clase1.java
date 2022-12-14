package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Clase1 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
//Vamos a necesitar las siguientes cadenas:
//Driver que vamos a utilizar para realizar la conexi?n
String driver = "com.mysql.cj.jdbc.Driver";
//Cadena de conexi?n: url donde se encuentra la base de datos
String cadenaConexion="jdbc:mysql://localhost:3306/camiones";
//Nombre de usuario con el que vamos a acceder
String usuario = "root";
//Contrase?a para ese usuario
String password = "";
//Consulta que vamos a lanzar contra la Base de Datos
String consulta = "Select nombre from ciudades";
// Creamos una instancia del driver jdbc a trav?s de su nombre
Class.forName(driver);
//Creamos una conexi?n a trav?s del DriverManager para esa cadena de conexi?n
Connection conexion = DriverManager.getConnection(cadenaConexion,usuario,password);
//Statement es una clase Java que se encarga de enviar consultas a trav?s de la conexi?n
Statement statement = conexion.createStatement();
//ResultSet es una clase Java que almacena las filas de la tabla devueltas por la consulta
ResultSet resultSet = statement.executeQuery(consulta);
while (resultSet.next()) //Mientras el resultSet tenga filas
{
//Se imprimen por pantalla el valor de los datos seleccionados en la consulta
System.out.print("Ciudades: " + resultSet.getString(1));
System.out.println();
}
//Cierro recursos.
resultSet.close();
statement.close();
conexion.close();
}
}