#include<iostream>
#include<cmath>
//Ingresar un número entero y mostrar la suma de cada una de sus cifras.

using namespace std;
int main(){
    int x1,c,d,u,m,suma;
    cout<<"Dime un numero y te dire la suma de sus cifras(maximo 4 cifras) ";
    cin>>x1;
    m=x1/1000;
    x1=x1-m*1000;
    c=x1/100;
    x1=x1-c*100;
    d=x1/10;
    x1=x1-d*10;
    u=x1;
    suma=c+d+u+m;
    cout<<"La suma es "<<suma;
    return 0;
}