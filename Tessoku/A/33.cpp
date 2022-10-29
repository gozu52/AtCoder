#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    int ans;cin>>ans;
    for(int i=0;i<n-1;i++){
        int a;cin>>a;
        ans ^= a;
    }
    cout<<(ans!=0?"First":"Second")<<endl;

}