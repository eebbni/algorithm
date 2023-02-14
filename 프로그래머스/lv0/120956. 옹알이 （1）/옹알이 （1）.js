function solution(babbling) {
    var answer = 0;
    const canSpeak = ["aya", "ye", "woo", "ma"];
    
    for(var i in babbling)
    {
        let text = babbling[i];
        
        canSpeak.forEach((v) => {
            if (babbling[i].includes(v)) text = text.replace(v, '')
        })

        if(text.length == 0 )
        {
            answer++;
        }
    }

    return answer;
}