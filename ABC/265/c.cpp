#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int h, w;
char g[501][501];
bool used[501][501];
int dx[4] = {0,1,0,-1};
int dy[4] = {1,0,-1,0};


void solve(){
    int x = 0, y = 0;
    while(true){
        used[x][y] = true;
        if(g[x][y]=='U'){
            x--;
            if(x<0||y<0||h<=x||w<=y){
                cout<<x+2<<" "<<y+1<<endl;
                return;
            }
            if(used[x][y]){
                cout<<-1<<endl;
                return;
            }else{
                used[x][y] = true;
            }
        }else if(g[x][y]=='D'){
            x++;
            if(x<0||y<0||h<=x||w<=y){
                cout<<x<<" "<<y+1<<endl;
                return;
            }
            if(used[x][y]){
                cout<<-1<<endl;
                return;
            }else{
                used[x][y] = true;
            }
        }else if(g[x][y]=='L'){
            y--;
            if(x<0||y<0||h<=x||w<=y){
                cout<<x+1<<" "<<y+2<<endl;
                return;
            }
            if(used[x][y]){
                cout<<-1<<endl;
                return;
            }else{
                used[x][y] = true;
            }
        }else if(g[x][y]=='R'){
            y++;
            if(x<0||y<0||h<=x||w<=y){
                cout<<x+1<<" "<<y<<endl;
                return;
            }
            if(used[x][y]){
                cout<<-1<<endl;
                return;
            }else{
                used[x][y] = true;
            }
        }
    }
}

int main(){
    cin>>h>>w;
    for(int i=0;i<h;i++)cin>>g[i];
    solve();
}