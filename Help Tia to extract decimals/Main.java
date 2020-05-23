#include<iostream>
#include <bits/stdc++.h>
using namespace std;
#include<string>
int main() 
{ 
	std::string num;
	std::cin>>num;
    int j=num.find(".");
    if(j==-1)
     std::cout<<"Floating part is :";
    else
    {
        std::cout<<"Floating part is : ";
        for(int i=j+1;num[i]!='\0';i++)
           std::cout<<num[i];
    }
      
    
}