#include <iostream>
#include <stdlib.h>

using namespace std;


int main(){
    int num;
    do{
         cout<<"Dame un numero: ";
         cin>> num;
    }while(num<1 || num >255);
   

    cout<< char(num);
    return 0;
}