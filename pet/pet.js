let highScore = 0;
let highScoreIndex = 0;
for(let i = 1; i <= 5; i++) {
    let line = readline().split(' ');
    let sum = 0;
    for(let j = 0; j < 4; j++) {
        sum += parseInt(line[j]);
    }
    if(sum > highScore) {
        highScore = sum;
        highScoreIndex = i;
    }
}
print(highScoreIndex + ' ' + highScore);