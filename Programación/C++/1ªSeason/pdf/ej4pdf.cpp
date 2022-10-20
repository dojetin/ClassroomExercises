#include <iostream>
#include <stdlib.h>
using namespace std;
/*
4- Crear un programa que pide y luego evalúa si dicho número es positivo, negativo o
neutro. Y después diga si es par o impar.
*/
int main(){
    int num;
    system("cls");
    cout<<"Introduce un numero \n";
    cin>>num;
    
    if (num>0)
    {
        cout<<"Es positivo";
    }else if (num<0)
    {
        cout<<"Es negativo";
    }else {
        cout<<"Es neutro";
    }
    
    if (num%2==0)
    {
        cout<<" y es par";
    }else{
        cout<<" y es impar";
    }
    

}