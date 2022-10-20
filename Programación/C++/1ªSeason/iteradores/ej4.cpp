#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Un programa que le introduzcas 4 números por teclado y los imprima en orden
de mayor a menor.
*/
int main()
{
    int n1, n2, n3, n4,mayor ,menor;
    cout << "Introduce 4 numeros por teclado \n";
    cin >> n1;
    cin >> n2;
    cin >> n3;
    cin >> n4;
    mayor=n1;
    menor=n1;
   while (n1>mayor || n2>mayor || n3>mayor ||n4>mayor)
   {
       mayor=mayor+1;
       
   };
   cout<<"mayor es "<<mayor;
   
   while (menor>n1||menor>n2||menor>n3||menor>n4)
   {
       menor=menor-1;
       
   };
   cout<<" menor es "<<menor;
   
  
}