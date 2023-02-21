function solution(n)
{
    var answer = 0;
    var str = String(n);
    
    for(var i = 0 ; i < str.length ; i ++)
    {
        answer += parseInt(str[i]);
    }

    return answer;
}