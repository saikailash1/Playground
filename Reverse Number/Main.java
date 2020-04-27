#include <iostream>
int main() 
{
	// Type your code here
  int a;
  std::cin>>a;
   int rev_num = 0; 
    while(a > 0) 
    { 
        rev_num = rev_num*10 + a%10; 
        a = a/10; 
    } 
  std::cout<<rev_num;
	return 0;
}