#include <iostream>
#include <stdlib.h>
using namespace std;
/*5) Crear un programa Pida por teclado una cantidad en pesetas,
Calcule su equivalente en euros, Muestre por pantalla el resultado.
*/
int main(){
system("cls");
float pesetas;
float euros;
cout<<"Introduce pesetas \n";
cin>>pesetas;
while (pesetas<0){
    cout<<"Introduce pesetas";
    cin>>pesetas;
}
euros=pesetas*0.006;
system("cls");
cout<<"Trasladadas a euros son "<<euros<<"euros";

return 0;
}