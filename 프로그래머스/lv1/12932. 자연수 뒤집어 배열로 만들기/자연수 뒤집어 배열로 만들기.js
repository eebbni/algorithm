function solution(n) {
    var ans = [];
    var str = String(n).split('');
    
    for(var i = str.length-1 ; i >= 0  ; i--)
    {
       ans.push(parseInt(str[i]));
    }
    
    return ans;
}