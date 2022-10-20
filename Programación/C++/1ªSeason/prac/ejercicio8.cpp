#include<iostream>
#include<cmath>
/*/Desarrolla un programa que permita calcular esta ecuación matemática. Las letras son valores
que tendremos que meter por teclado. Nos ha de devolver la solución./*/
using namespace std;
int main(){
int y,z;
float cuenta;
    cout<<"La cuenta es (2*((rc)y))/(5-z)\n";
    cout<<"Escribe el valor de y\n";
    cin>>y;
    cout<<"Escribe el valor de z\n";
    cin>>z;
    cuenta=(2*(sqrt(y)))/(5-z);
    cout<<"El resultado es "<<cuenta<<"\n";

    return 0;
}
