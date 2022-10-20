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
    int num=0;
    string texto;
    ifstream conecio;
    conecio.open("poetisias.txt");
    system("cls");
    if (conecio.is_open())
    {
        conecio>>num;
        for (int i = 0; i <= num; i++)
        {
            getline(conecio,texto);
            cout<<texto<<endl;
        } 
    }else{
        cout<<"El archivo no existe";
    }
    
}