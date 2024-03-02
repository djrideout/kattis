let line = readline().split(' ');
let l = parseInt(line[0]);
let r = parseInt(line[1]);
let pts = 2 * Math.max(l, r);
if(l === 0 && r === 0) print('Not a moose');
else if(l === r) print('Even ' + pts);
else print('Odd ' + pts);