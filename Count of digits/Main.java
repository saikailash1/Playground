#include<iostream>
int main()
{
  // Type your code here
  int no,a=0;
  std::cin>>no;
  do
  {
no=no/10;
a++;
}while(no>0);
std::cout<<a;
  return 0;
}