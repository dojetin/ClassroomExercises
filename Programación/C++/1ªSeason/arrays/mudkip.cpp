#include <iostream>
#include <stdlib.h>
using namespace std;


int main()
{
    system("cls");
    int numeros[]={1,2,3,4,5};
    int otros[5];
    int n = 0 ;
    
    for (int i = 4; i >-1; i--)
    {
        otros[n] = numeros[i];
        cout<<otros[n];
        n++;
    }
    
}