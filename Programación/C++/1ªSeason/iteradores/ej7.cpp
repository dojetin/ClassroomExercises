#include <iostream>
#include <stdlib.h>
using namespace std;
/*
7. Desarrolla una aplicación que solicite introducir 8 valores CHAR y los concatena
para crear un string. [No me creéis 8 variables CHAR] 
*/
int main()
{
    char caracter;
    string cadena;
    system("cls");
    for (int i = 0; i < 8; i++)
    {
        cout << "Introduce un caracter ";
        cin >> caracter;
        cadena = cadena + caracter;
    }
    cout << "La cadena formada es " << cadena;

    return 0;
}