#include <iostream>
#include <stdlib.h>
using namespace std;
/*
6. Desarrolla un programa en el que introduzcas una palabra y te diga cuantas
letras la componen. [investiga la propiedad .size()] 
*/
int main()
{
string cadena;
int num=0;
system("cls");
cout<<"Introduce una cadena \n";
cin>>cadena;
num=cadena.size();
cout<<"La componen "<<num<<" letras";

}