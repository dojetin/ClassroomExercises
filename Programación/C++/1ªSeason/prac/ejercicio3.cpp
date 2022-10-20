#include<iostream>
#include<cmath>
#include <ctime> 
/*/Desarrolla un programa que genere un número aleatorio entre 1 y 100. El usuario deberá
adivinar dicho número introduciendo valores por teclado. El programa deberá decirle al
usuario si el número que ha introducido es mayor o menor que el que genero aleatoriamente
al principio, hasta que lo adivine. Al final poner texto de felicitación por haberlo adivinado y el
número de intentos que ha necesitado./*/

using namespace std;
int main(){
    int x,c;//Definimos las variables
    c=0;
    srand (time(NULL));//Hacemos que el programa saque un numero al azar entre 0 y 99 yle sumamos 1
        int y = rand()%100 + 1;
        cout<<"BIENVENIDO A LA TOMBOLA DEL CASINO AZULONA\n";
        cout<<"Deberas intentar adivinar el numero secreto para ganar el misterioso premio\n";
        do{
            cout<<"Escribe un numero ";//Pide un numero y te dice si es menor o mayor que el numero al azar
            cin>>x;
            if (x<y){
                cout<<"Te has quedado corto \n";
            }
            else if (x>y){
                cout<<"Te has pasado \n";
            }
            c++;
            
        } while (x!=y);
    cout<<"ENHORABUENA HAS GANADO! (APLAUSO APLAUSO)\n";//Si lo consigue ste pone un mensaje de felicitacion
    cout<<"SOLO HAS TARDADO "<<c<<" veces \n";
    switch (c) {

        case 1:
            cout<<"Na,estas loco,toma una master ball";
            break;
        case 2:
            cout<<"Not bad,tu premio es un Dratini";
            break;
        case 3:
            cout<<"Ta bien,toma un porygon que no vas a poder evolucionar porque no tienes amigos";
            break;
        case 4:
            cout<<"En la media,toma un Abra";
            break;
        case 5:
            cout<<"Al limite,toma la MT90";
        
        default:
            cout<<"Literalmente mi prima de 5 anyos lo hizo mejor \n";
            cout<<"Toma una piedra eterna para que te diviertas\n";
}
    
    cout<<"HASTA LA SIGUIENTE TOMBOLA!";

return 0;
}
