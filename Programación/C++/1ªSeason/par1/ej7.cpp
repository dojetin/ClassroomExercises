#include <iostream>
#include <stdlib.h>
using namespace std;
/*7) Intercambiar el valor de dos números,
introducidos por teclado
*/
int main(){
system("cls");
int a,b,c;
cout<<"Introduce un numero\n";
cin>>a;
cout<<"Introduce otro numero\n";
cin>>b;
c=a;
a=b;
b=c;
system("cls");
cout<<"Los numeros intercambiados son "<<a<<" y "<<b;

return 0;
}