function solution(s){
  var answer = true;
  s = s.toUpperCase();
  var a = {};
  
  [...s].forEach((v)  => {
    if(a[v] > 0)
    {
        a[v] ++;
    }
    else
    {
        a[v] = 1;
    }
  }) 

  if(a['P'] == a['Y'] || (!a['P'] && !a['Y']))
  {
      answer = true
  }
  else
  {
      answer = false
  }

  return answer;
}