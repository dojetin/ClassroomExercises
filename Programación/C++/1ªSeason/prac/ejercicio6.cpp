//Literalmente este ejercicio es casi igual que el 7 pero con mas contadores
#include<iostream>
#include<cmath>
/*/Crea un programa que imprime en pantalla tantos números pares como se le indique desde el
teclado, empezando por otro número que introduzcamos por teclado, y finalmente los sume
todos./*/
using namespace std;
int main(){
    int x,n,c,suma;
    c=0;
    suma=0;
    cout<<"Indique el numero de pares que quieres \n";//
    cin>>x;
    cout<<"Ahora escribe el numero por el que quiere que empieze a darte (tiene que ser par)";
    cin>>n;
    if (n%2==0){
    
        do{
        cout<<n+2<<"\n";
        n=n+2;
        c++;
        suma=suma+n;
    }while (x>c);
        cout<<"La suma total es "<<suma;
        }else
        {
            cout<<"EL NUMERO INTRODUCIDO NO ES VALIDO";
        }
        

    return 0;
}