int numi=1;
#include <iostream>
#include <stdlib.h>
using namespace std;
/*
14. Leer por teclado un número entero N no negativo y mostrar el factorial de
todos los números desde 0 hasta N
*/
int main()
{
    int num1, aux, contador;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> num1;
    } while (numi < 1);
    aux = numi-1;
    contador = numi;
    system("cls");
    for (int i = 1; i != contador; i++)
    {
        numi=numi*aux;
        aux--;
    }
    cout << numi<<" ";
}