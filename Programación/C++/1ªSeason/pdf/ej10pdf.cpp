#include <iostream>
#include <stdlib.h>
using namespace std;
/*
10- Hacer un programa para ayudar a un trabajador a saber cuál será su sueldo semanal, se
sabe que, si trabaja 40 horas o menos, se le pagará 20€ por hora, pero si trabaja más de
40 horas entonces las horas extras se le pagarán a 25€ por hora. ¿Cuánto cobra a final de
mes?
*/
int main()
{
    int horas;
    float sueldo;
    system("cls");
    cout<<"Cuantas horas has trabajado esta semana?";
    cin>>horas;
    system("cls");
    if (horas>40)
    {
        horas=horas-40;
        sueldo=800+(horas*25);
        cout<<"Cobrara "<<sueldo<<" euros";
    }else{
        sueldo=horas*20;
        cout<<"Cobrara "<<sueldo<<" euros";
    }
    

}