#include<iostream>
#include<cmath>
//Programa que nos lleve la cuentas de nuestros ingresos y gastos.

using namespace std;
int main(){
    int x,gasto,ingreso,saldo;//Definimos las variables que necesitamos
    saldo=0;
    cout<<"Bienvenido a Banco Rocavelo:\n";
    do{
        cout<<"OPCIONES:\n";//Le damos las opciones 
        cout<<"1.Ver Saldo \n";
        cout<<"2.Ingresar \n";
        cout<<"3.Gasto \n";
        cout<<"4.Salir \n";
        cin>>x;
            if (x<1 || x>4)//Comprobamos si el numero introducido es valido
            {
                cout<<"Numero no valido \n";
                
            }else//Si es valido realiza una accion segun el valor de x 
                switch (x){
                    case 1:
                        cout<<"Tu saldo actual es de "<<saldo<<"\n";
                        break;
                    case 2:
                        cout<<"Cuanto dinero quieres ingresar? ";
                        cin>>ingreso;
                        saldo=saldo+ingreso;
                        cout<<"Tu saldo actual es de "<<saldo<<"\n";
                        break;
                    case 3:
                        cout<<"Cuanto dinero quieres retirar? ";
                        cin>>gasto;
                            if (gasto>saldo){
                                    cout<<"Operacion invalidada \n";
                                    cout<<"Saldo insuficiente \n";
                            }else
                                    saldo=saldo-gasto;
                                    cout<<"Tu saldo actual es de "<<saldo<<"\n";
                        break;
                
            }
    } while (x!=4);//Cuando hayamos elegido la opcion 4 saldra del programa
    cout<<"FIN DEL PROGRAMA";    

return 0;
}

