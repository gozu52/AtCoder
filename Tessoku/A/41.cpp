#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

char tile[200001];

int main() {
    int n;cin>>n;
    cin>>tile;
    for(int i=1;i<n-1;i++){
        if(tile[i-1]==tile[i] && tile[i+1]==tile[i]){
            cout<<"Yes"<<endl;
            return 0;
        }
    }
    cout<<"No"<<endl;
}