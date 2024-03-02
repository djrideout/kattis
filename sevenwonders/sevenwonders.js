let line = readline();
let numT = 0;
let numC = 0;
let numG = 0;
let score = 0;
for(let i = 0; i < line.length; i++) {
    if(line.charAt(i) === 'T') {
        numT++;
    } else if(line.charAt(i) === 'C') {
        numC++;
    } else {
        numG++;
    }
}
let numSets = Math.min(numT, Math.min(numC, numG));
score += numSets * 7;
score += Math.pow(numT, 2) + Math.pow(numC, 2) + Math.pow(numG, 2);
print(score);