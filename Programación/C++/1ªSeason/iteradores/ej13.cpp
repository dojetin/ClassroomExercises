#include <iostream>
#include <stdlib.h>
using namespace std;
/*
13. Desarrolla un programa que calcule he imprima los N números de la serie de
fibonacci.
*/
int main()
{
    int num, aux1 = 0, aux2 = 1, aux3=0;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> num;
    } while (num < 1);
    system("cls");

    cout<<aux1<<" ";
    
    for (int i = 0; i != num; i++)
    {
        
        cout << aux2<<" ";
        aux2=aux1+aux2;
        aux1=aux2-aux1;
        
        
      
    }
}