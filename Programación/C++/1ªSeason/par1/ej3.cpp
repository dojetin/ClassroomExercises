#include <iostream>
#include <stdlib.h>
using namespace std;
//3) Crear un programa que me 
//pida tu año de nacimiento y calcule tu edad
const int Anyoactual=2021;
int main(){
int edad;
system("cls");
cout<<"Introduce su anyo de nacimiento";
cin>>edad;
while (edad<0){
cout<<"Introduce su anyo de nacimiento";
cin>>edad;
}
edad=anyoactual-edad;
cout<<"Su edad es "<<edad;

return 0;
}