function solution(n) {
    var str = String(n).split('').reverse().map(v => parseInt(v));
    
    return str;
}