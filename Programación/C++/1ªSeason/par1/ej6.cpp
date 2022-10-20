#include <iostream>
#include <stdlib.h>
using namespace std;
/*6) Crear un programa que me pida el nombre, la edad y la
población y me muestre esos datos
*/
int main(){
system("cls");
string nombre, edad, poblacion;
cout<<"Dime tu nombre\n";
cin>>nombre;
system("cls");
cout<<"Dime tu edad\n";
cin>>edad;
system("cls");
cout<<"Dime tu poblacion\n";
cin>>poblacion;
cout<<"Tu nombre es "<<nombre<<"\nTu edad es "<<edad<<"\nTu poblacion es "<<poblacion;
}