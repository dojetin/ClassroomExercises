#include <iostream>
#include <stdlib.h>
#include <cmath>
using namespace std;
/*
8) Introduciremos 5 valores por teclado, 
el programa debe decidir cual de ellos es mayor.
*/
int main(){
system("cls");
int num1,num2,num3,num4,num5,max,min;
cout<<"Introduce 5 numeros \n";
cin>>num1>>num2>>num3>>num4>>num5;
system("cls");
if (num1>num2 && num1>num3 && num1>num4 && num1>num5){
   cout<<num1<<" Es el mayor";
}else if (num2>num3&&num2>num4&&num2>num5){
     cout<<num2<<" Es el mayor";
}else if (num3>num4&&num3>num5){
    cout<<num3<<" Es el mayor";
}else if (num4>num5){
     cout<<num4<<" Es el mayor";
}else{
 cout<<num5<<" Es el mayor";
}


return 0;

}