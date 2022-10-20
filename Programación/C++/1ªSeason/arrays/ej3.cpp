#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
/*
3. Desarrolla un programa que pida 10 elementos para un array y los
almacene en orden contrario.
*/
int main()
{
    int v1[10];
    int aux=9;
    system("cls");
    for (int i = 0; i <10 ; i++)
    {
        cout<<"Dime un numero\n";
        cin>>v1[aux];
        aux--;
    }
    aux=0;
    for (int i = 0; i < 10; i++)
    {
        cout<<v1[aux]<<" ";
        aux++;
    }
    
    

}