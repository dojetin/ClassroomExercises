#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Crea un programa que imprime en pantalla tantos números pares como se le indique desde el
teclado, empezando por otro número que introduzcamos por teclado, y finalmente los sume
todos.
*/
int main()
{
    int primero = 0, total = 0, contador=0; //Declaracion e inicializacion de variables
    system("cls");
    do  //Le pedimos el numero por el que empezar y comprueba que sea par y mayor que 0
    {
        cout << "Por que numero quieres empezar? \n";
        cin >> primero;
    } while (primero < 0 || primero % 2 == 1); //
    system("cls");
    do  //Le preguntamos cuantos numeros quiere y comprueba que sea positivo
    {
        cout << "Cuantos numeros quieres? \n";
        cin >> contador;
    } while (contador<0);
    system("cls");
    while (contador!=0)
    {
        cout<<primero<<endl;
        total=total+primero;
        primero=primero+2;
        contador--;
    }
    cout<<"La suma de todos los numeros es "<<total;
    
}