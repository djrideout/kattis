let line;
while(true) {
    line = parseInt(readline());
    if(line === -1) break;
    let numMiles = 0;
    let prev = 0;
    for(let i = 0; i < line; i++) {
        let line2 = readline().split(' ');
        let n1 = parseInt(line2[0]);
        let n2 = parseInt(line2[1]);
        numMiles += n1 * (n2 - prev);
        prev = n2;
    }
    print(numMiles + ' miles');
}