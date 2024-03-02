let line = readline().split(' ');
let h = parseInt(line[0]);
let m = parseInt(line[1]);
let date = new Date();
date.setHours(h);
date.setMinutes(m - 45);
print(date.getHours() + ' ' + date.getMinutes());