#include <iostream>
#include <stdlib.h>
using namespace std;
/*
2- Crear un programa que pide una edad y
luego evalúa si es mayor de edad o no lo es.
*/
int main(){
    int edad;
    system("cls");
    cout<<"Introduce tu edad";
    cin>>edad;
    system("cls");
    if (edad>=18)
    {
        cout<<"Eres mayor de edad";
    }else{
        cout<<"Eres menor de edad ;)";
    }
    

}