#include <iostream>
#include <stdlib.h>
using namespace std;
/*
10. Algoritmo que lea un número entero (altura) y a partir de él cree una escalera
invertida de asteriscos con esa altura. Deberá quedar así, si ponemos una altura
de 5.
*****
****
***
**
*
*/
int main()
{
    int altura = 0, base;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> altura;
    } while (altura < 1);
    system("cls");
    while (altura!=0)
    {
        base=altura;
        cout<<"\n";
        
        while (base!=0)
        {
            cout<<"*" ;
            base=base-1;
        }
        altura=altura-1;
    }
}