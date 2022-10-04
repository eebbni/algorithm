function solution(num) {
    // 작업 몇번째 인지
    var count = 1;
    var i = 0;
    
    if(num == 1)
    {
        return 0;
    }

    while( i <= 500 )
    {
        if(num % 2 == 0) // 짝수
        {
            num = num / 2;
        }
        else // 홀수
        {
            num = num * 3 + 1;
        }

        if(num == 1)
        {
            break;
        }
        
        count ++;
        i++;
    }
    
    if(num == 1)
    {
        return count;
    }
    else
    {
        return -1;
    }
}