#include <iostream>
#include <stdlib.h>
using namespace std;
/*
4) Crear un programa que permita leer el valor 
correspondiente a una distancia en kilómetros y las 
visualice expresadas en metros
*/
int main(){
int km;
system("cls");
cout<<"Introduce una distancia en kilometros \n"; 
cin>>km;
while (km<0){
    cout<<"Introduce una distancia en kilometros \n"; 
    cin>>km;
}

km=km*1000;
cout<<"La distancia trasladada a metros es "<<km;

return 0;
}