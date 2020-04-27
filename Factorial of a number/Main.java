#include<iostream>
int main(){
  // Type your code here
  int n,fact=1;
  std::cin>>n;
  for(int k=n;k>=1;k--)
  {
    fact=fact*k;
  }
  std::cout<<fact;
}