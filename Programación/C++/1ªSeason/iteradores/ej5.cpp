#include <iostream>
#include <stdlib.h>
using namespace std;
/*
5. Desarrolla el código de una aplicación que pida una cadena y un carácter por
teclado y muestra cuántas veces aparece un carácter concreto en la cadena.
*/
int main()
{
    string cadena;
    int numcar = 0;
    char caracter;
    system("cls");
    cout << "Introduce una cadena de caracteres \n";
    cin >> cadena;
    int count = cadena.size();
    cout << "Que caracter quieres ver \n";
    cin >> caracter;
    system("cls");
    for (int i = 0; i < count; i++)
    {
        if (caracter == cadena[i])
        {
            numcar++;
        }
    }
    cout << "Aparece " << numcar << " veces";
}