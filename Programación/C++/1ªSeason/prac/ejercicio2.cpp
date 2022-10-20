#include<iostream>
#include<cmath>
/*/Desarrolle un algoritmo que lea números enteros por teclado hasta que le introduzcamos un 0.
En ese momento nos mostrará por pantalla el número más alto que hayamos introducido, la
media aritmética de todos ellos y cuantos números hemos introducido/*/

using namespace std;
int main(){
    int x,suma,c,mayor;//Definimos las variables
    float media;//La media tiene que ser un float porque puede ser decimal
    c=0;
    mayor=0;
    suma=0;
    do{//Creamos un bucle con do while para que entre minimo una vez
        cout<<"Escribe un numero o escribe 0 para terminar ";
        cin>>x;
        if (x>mayor){
            mayor=x;   
        }
        suma=suma+x;
        if (x!=0){
            c++;
        }
    } while (x!=0);

    media=suma/c;
    cout<<"El numero mas alto es "<<mayor<<"\n";
    cout<<"La media de todos los numeros es "<<media<<"\n";
    cout<<"Has introducido  "<<c<<" numeros \n";
return 0;
}