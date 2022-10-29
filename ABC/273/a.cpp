#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int f(int num){
    if(num==0)return 1;
    return num*f(num-1);
}

int main() {
    int n;cin>>n;
    cout<<f(n)<<endl;
}