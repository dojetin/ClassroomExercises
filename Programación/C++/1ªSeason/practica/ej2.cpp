#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Desarrolle un algoritmo que lea números enteros por teclado hasta que le introduzcamos un 0. 
En ese momento nos mostrará por pantalla el número más alto que hayamos introducido, la 
media aritmética de todos ellos y cuantos números hemos introducido
*/
int main()
{
    int eleccion = 1, mayor = 0, suma = 0; //Declaracion e inicializacion de variables
    double media = 0, contador=0;
    while (eleccion != 0)
    {
        system("cls");
        cout << "Introduce un numero (0 para terminar) \n";
        cin >> eleccion;
        if (eleccion > mayor) //Comprueba que el numero introducido sea mayor que el mayor y si es mayor se asigna.
        {
            mayor = eleccion;
        }
        if (eleccion != 0) //Se le suma 1 al contador
        {
            contador++;
        }
        suma = suma + eleccion; //Se va sumando el numero para calcular la media
        media=suma/contador;    //Se calcula la media
        system("cls");
    }
       
    if (contador > 1) //Esta comprobacion es por si el primer numero que introduce es 0 que no muestre nada
    {
        cout << "El numero mayor que has introducido es " << mayor << "\n"; //Muestra el num mayor
        cout << "La media de los numeros es " << media << "\n";             //Muestra la media
        cout << "Has introducidos " << contador << " numeros \n";           //Muestra el numero de numeros introducidos
    }
}