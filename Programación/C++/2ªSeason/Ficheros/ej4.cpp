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
    ofstream escritura;
    int num=0;
    escritura.open("frases.txt");
    string eleccion;
    string frases_m;
    string texto;
    if (escritura.is_open())
    {
        do
        {
            
            system("cls");
            cout<<"Escribe una frase\n";
            //cin.ignore();
            getline(cin,frases_m);
            escritura<<frases_m<<endl;
            cout<<"¿Desea escribir otra frase?";
            cin>>eleccion;
            fflush(stdin);
            num++;
        } while (eleccion=="si"||eleccion=="Si"||eleccion=="Sí"||eleccion=="sí");
    }
    escritura.close();
    ifstream lectura;
    lectura.open("frases.txt");
    if (lectura.is_open())
    {
        for (int i = 0; i <= num; i++)
        {
            cout<<texto<<endl;
            getline(lectura,texto);
        } 
        
    }
    
    
    
    


}