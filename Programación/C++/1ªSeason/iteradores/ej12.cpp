#include <iostream>
#include <stdlib.h>
using namespace std;
/*
12. Desarrolla un programa que imprime en pantalla tantos números impares
como se le indique desde el teclado, empezando por el número 11
*/
int main()
{
    int veces, aux=11;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> veces;
    } while (veces < 1);

    for (int i = 0; i < veces; i++)
    {
        cout<<aux<<endl;
        aux=aux+2;
    }
    



}