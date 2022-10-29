#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    int ans[10] = {};
    for(int i=0;i<10;i++)ans[i] = n/(1<<i)%2;
    for(int i=9;i>=0;i--)cout<<ans[i];
    cout<<endl;
}