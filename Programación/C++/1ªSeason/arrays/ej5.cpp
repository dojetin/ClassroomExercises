#include <iostream>
#include <stdlib.h>
using namespace std;
/*
5. Desarrolla un programa que genere un array con los 100 primeros pares
*/
int main()
{
    int arrai[100];
    int n=2;
    for (int i = 0; i < 100; i++)
    {
        arrai[i]=n;
        n=n+2;
        cout<<arrai[i];
    }
    
}