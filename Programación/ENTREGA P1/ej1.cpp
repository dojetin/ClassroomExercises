#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;
/*

*/
int main()
{
    system("cls");
    int aux=4, num, pos;
    int arrai[5],inverted[5];
    srand(time(NULL));
    for (int i = 0; i < 5; i++)
    {
        arrai[i] = rand() % 100; 
        cout<<"El array uno esta compuesto por : "<<arrai[i]<<endl;       
    }
    cout<<endl<<endl;
    for (int i = 0; i<5; i++)
        {
            inverted[i]=arrai[aux];
            cout<<"El array dos esta compuesto por : "<<inverted[i]<<endl;
            aux--;
        }
    do
    {
        cout<<"En que posicion quiere introducir un numero?\n";
        cin>>pos;
    } while (pos<0||pos>4);

    cout<<"Que numero?\n";
    cin>>num;
        while (num!=0)
    {
        arrai[pos]=num;
        //arrays
        for (int i = 0; i < 5; i++)
    {
        cout<<"El array uno esta compuesto por : "<<arrai[i]<<endl;       
    }
    aux=4;
    cout<<endl<<endl;
    for (int i = 0; i<5; i++)
        {
            inverted[i]=arrai[aux];
            cout<<"El array dos esta compuesto por : "<<inverted[i]<<endl;
            aux--;
        }
        cout<<"En que posicion quiere introducir un numero?";
        cin>>pos;
        cout<<"Que numero?";
        cin>>num;
    }
    
    
    
    
}