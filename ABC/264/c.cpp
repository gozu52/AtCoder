#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int h1,w1,h2,w2;
int a[10][10];
int b[10][10];
vector<int> qh;
vector<int> qw;

void solve(){
    for(int i=0,k=0;i<h1;i++){
        int cntw = 0;
        for(int j=0;j<w1;j++){
            if(a[i][j] == b[k][cntw]){
                cntw++;
            }
        }
        if(cntw==w2){
            k++;
            qw.push_back(i);
        }
    }
    for(int i=0,k=0;i<w1;i++){
        int cnth = 0;
        for(int j=0;j<h1;j++){
            if(a[j][i] == b[cnth][k]){
                cnth++;
            }
        }
        if(cnth==h2){
            k++;
            qh.push_back(i);
        }
    }
    if(qh.size()==w2&&qw.size()==h2)cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
}

int main(){
    cin>>h1>>w1;
    for(int i=0;i<h1;i++)for(int j=0;j<w1;j++){
        cin>>a[i][j];
    }
    cin>>h2>>w2;
    for(int i=0;i<h2;i++)for(int j=0;j<w2;j++){
        cin>>b[i][j];
    }
    solve();
}