#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Introducir un número por teclado y tu nombre y mostrar tu nombre por
pantalla tantas veces como indique dicho número.
*/
int main()
{
    int veces;
    string nombre;

    system("cls");
    cout << "Dime tu nombre \n";
    cin >> nombre;

    system("cls");
    cout << "Cuantas veces quieres que lo muestre? \n";
    cin >> veces;

    system("cls");

    for (int i = 0; i < veces; i++)
    {
        cout << nombre << endl;
    }

    system("pause");
}