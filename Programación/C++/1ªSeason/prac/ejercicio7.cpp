#include<iostream>
#include<cmath>
/*/Desarrolla el algoritmo de un programa introduciendo un número, genere la tabla de
multiplicar. Pero no hasta 10, sino hasta otro número que nosotros introduzcamos por teclado.
El programa no permite números negativos./*/
using namespace std;
int main(){
    int x,n,c;
    c=0;
    cout<<"Escribe el numero que quieres multiplicar \n";//Te pide el numero que vas a multiplicar y las veces que lo multiplicas
    cin>>x;
    cout<<"Ahora escribe hasta que numero quieres que llegue la tabla \n";
    cin>>n;
    do{
        cout<<x<<"x"<<c<<"="<<x*c<<"\n";//Te escribe la multiplicacion y se le va sumando a c +1 cada vez que hace el bucle
        c++;
    } while (n>=c);//El bucle se hace mientras c sea menor o igual que n para asi hacer el ultimo valor
return 0;
}    