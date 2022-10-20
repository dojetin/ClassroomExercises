#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Desarrolle un algoritmo que lea números enteros por teclado hasta que le introduzcamos un 0. 
En ese momento nos mostrará por pantalla el número más alto que hayamos introducido, la 
media aritmética de todos ellos y cuantos números hemos introducido
*/

bool par(int num);

int main()
{
int num=0;
cout<<"introduce un numero";
cin>>num;
if (par(num))
{
    cout<<"Es par precioso";
}else{
    cout<<"Es impar tontito";
}


}
bool par(int num)
{
    if (num%2==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}