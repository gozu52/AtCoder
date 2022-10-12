#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,ans = 0;;cin>>n;
    for(int i=0;i<n;i++){
        int tmp;cin>>tmp;
        ans += tmp;
    }
    cout<<ans<<endl;
}