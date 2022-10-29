#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int h,w;

int main() {
    cin>>h>>w;
    char c[h][w];
    int x[w]={};
    for(int i=0;i<h;i++){
        cin>>c[i];
    }
    for(int i=0;i<w;i++){
        for(int j=0;j<h;j++){
            if(c[j][i]=='#')x[i]++;
        }
    }
    for(int i=0;i<w;i++)cout<<x[i]<<" ";
    cout<<endl;
}