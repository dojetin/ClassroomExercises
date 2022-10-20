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
    string v1;
    enum color{rojo,verde,azul};
    struct libro
    {
        string titulo;
        string autor;
        int anno;
        color colorLibro;
    };
    libro l1;
    cout<<"Dime el titulo del libro";
    cin>>l1.titulo;
    cout<<"Dime el autor del libro";
    cin>>l1.autor;
    cout<<"Dime el año del libro";
    cin>>l1.anno;
    cout<<"Dime el color del libro";
    cin>>v1;
    if (v1=="rojo")
    {
        l1.colorLibro=rojo;
    }
    
}