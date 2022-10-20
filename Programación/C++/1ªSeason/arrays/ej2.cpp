#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
/*
2. Desarrolla un programa que genere un array de 5 elementos aleatorios
pares y los guarde un array.
*/
int main()
{
    system("cls");
    int count = 5, azar = 0, aux = 0;
    int pacopepe[5];
    srand(time(NULL));
    for (int i = 0; i < count; i++)
    {
        azar = rand() % 100;
        if (azar % 2 == 0)
        {
            pacopepe[aux] = azar;          
            cout<< pacopepe[aux]<<" ";
            aux++;
        }
        else
        {
            count++;
        }
    }
}