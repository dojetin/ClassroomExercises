#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Desarrolla el algoritmo de un programa introduciendo un número, genere la tabla de
multiplicar. Pero no hasta 10, sino hasta otro número que nosotros introduzcamos por teclado.
El programa no permite números negativos.
*/
int main()
{
    system("cls");
    int num = 0, contador = 0, aux = 1; //Declaracion e inicializacion de variables
    do  //Le pides el numero a multiplicar y se comprueba que sea mayor a 0
    {
        cout << "De que numero quieres la tabla de multiplicar?\n";
        cin >> num;
    } while (num < 0);
    system("cls");
    do
    {
        cout << "Hasta que numero quieres?\n";  //Se le pide hasta que numero quiere multiplicar y se comprueba que sea mayor que uno
        cin >> contador;
    } while (contador < 0);
    system("cls");
    do  //Se va haciendo la multiplicacion
    {
        cout << num << "*" << aux << "=";
        cout << num * aux << endl;
        aux++;
        contador--;
    } while (contador != 0);
}