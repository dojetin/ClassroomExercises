#include <iostream>
#include <stdlib.h>
#include "_resta.hpp"
#include "_multiplicar.hpp"
#include "_dividir.hpp"
using namespace std;
/*
9) Desarrolla un programa que me pida dos números y me 
calcule las 4 operacionesmatemáticas. (Intenta hacerlo usando 
funciones tanto que estén en el mismo fichero.cpp como en una 
librería externa)
*/
int suma(int n1, int n2);

int main(){
int num1, num2,sol,elec;
system("cls");
cout<<"Introduce segun tu eleccion\n";
cout<<"1.Sumar \n";
cout<<"2.Restar \n";
cout<<"3.Multiplicar \n";
cout<<"4.Dividir \n";
cin>>elec;
system("cls");
cout<<"Introduce dos numeros\n";
cin>>num1>>num2;

switch (elec){
case 1:
    sol=suma(num1,num2);
    cout<<"La suma es igual a "<<sol;
    break;
case 2:
    sol=resta(num1,num2);
    cout<<"La resta es igual a "<<sol;
    break;
case 3:
    sol=multiplicar(num1,num2);
    cout<<"La multiplicación es igual a "<<sol;
    break;
case 4:
    sol=dividir(num1,num2);
    cout<<"La division es igual a "<<sol;
    
    default: cout<<"Ere tonto";
    break;
}

}


int suma(int n1, int n2){
   int n3;
   n3=n1+n2;
return n3;

}