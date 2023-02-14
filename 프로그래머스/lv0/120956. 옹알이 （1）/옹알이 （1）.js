function solution(babbling) {
    var answer = 0;
    var canSpeak = ["aya", "ye", "woo", "ma"];
    
    for(var i = 0 ; i < babbling.length ; i++)
    {
        if(canSpeak.includes(babbling[i]))
        {
            answer++;
        }
    }
    return answer;
}