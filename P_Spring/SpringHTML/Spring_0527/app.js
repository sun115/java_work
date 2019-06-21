var express = require('express');
var http = require('http');
// vars cors = ('CORS');
var app = express();
//80번 포트에 app 이라는 서버를 만들겠다.
var server = http.createServer(app).listen(80);

//localhost 의 blank request를 받으면 MAIN PAGE라고 response하겠다.
app.get('/', function (req, res) {
  res.send("MAIN PAGE");
});


// localhost 연결 방법
// cmd - cd (실행하려는 app.js가 있는 폴더) - supervisor app.js
// chrome - http://localhost/어쩌구저쩌구



//test라는 request를 받으면 TURN BACK 이라고 response하겠다.
// app.get('/list', function (req, res) {
//   res.sendfile("list.html");
// });

app.get('/test', function (req, res) {
  res.sendfile("html5.html");
});

app.get('/test2', function (req, res) {
  res.sendfile("test2.html");
});



console.log("running");
