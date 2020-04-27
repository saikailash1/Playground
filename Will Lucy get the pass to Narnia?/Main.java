#include<iostream>
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  std::cout<<"Enter first number : Enter second number : Menu \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";    
  switch(c)
  {
    case 1:std::cout<<"\n"<<a+b;
      break;
    case 2:std::cout<<"\n"<<a-b;
      break;
    case 3:std::cout<<"\n"<<a*b;
      break;
    case 4:std::cout<<"\n"<<a/b;
      break;
    case 5:std::cout<<"\n"<<a%b;
      break;
    default: std::cout<<"\nInvalid operation";      
  }
return 0;
}