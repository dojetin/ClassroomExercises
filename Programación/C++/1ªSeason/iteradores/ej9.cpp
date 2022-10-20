#include <iostream>
#include <stdlib.h>
using namespace std;
/*
9. Pedir un número por pantalla (un número menor que 10) y visualizar por
pantalla su tabla de multiplicar.
*/
int main()
{
    int num, aux=0;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> num;
    } while (num >= 10 || num < 1);
    system("cls");
    for (int i = 0; i <= 10; i++)
    {
        cout<<aux<<endl;
        aux=aux+num;
        
    }
    


}