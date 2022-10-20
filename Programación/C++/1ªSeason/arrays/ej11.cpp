#include <iostream>
#include <stdlib.h>
using namespace std;
/*
11. Crea un programa que lea 10 números por teclado, los almacene en un
array y muestre la suma, resta, y multiplicación de todos
*/
int main()
{   
    system("cls");
    int var=0,suma=0,resta=0,multi=1;
    int arrai1[10];
    for (int i = 0; i < 10; i++)
    {
        cout<<"Introduce un numero\n";
        cin>>var;
        arrai1[i]=var;
        suma=suma+arrai1[i];
        resta=resta-arrai1[i];
        multi=multi*arrai1[i];
    }
    cout<<"La suma de todos "<<suma<<endl;
    cout<<"La resta de todos "<<resta<<endl;
    cout<<"La multiplicacion de todos "<<multi<<endl;

}