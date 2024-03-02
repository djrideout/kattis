let line = readline().split(' ');
let height = parseInt(line[0]);
let angleDeg = parseInt(line[1]);
let angleRad = angleDeg * Math.PI / 180;
print(Math.ceil(height / Math.sin(angleRad)));