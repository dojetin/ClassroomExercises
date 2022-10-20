#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <windows.h>
using namespace std;
/*
Crea un programa que trabaje con un fichero mostrado por pantalla los datos que tenga
almacenados.
*/
int main()
{
    SetConsoleOutputCP(CP_UTF8);
    string texto;
    ifstream conecio;
    conecio.open("poetisios.txt");
    system("cls");
    if (conecio.is_open())
    {
        getline(conecio, texto);
        while (texto != "x")
        {
            
            cout << texto << endl;
            getline(conecio, texto);
        }
    }
    else
    {
        cout << "El archivo no existe";
    }
}