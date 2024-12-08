// const add = require('./My01_module1'); // CommonJS syntax

// console.log(add(5, 6));

// const fs = require('fs');
// fs.writeFileSync('./My01_module1.js', 'console.log("Hello world!")');
// console.log('File written successfully');

// Create a server

const http = require("http");

const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader("content-type", "text/plain");
    res.end("Hello");
});

server.listen(2000, () => {
    console.log("Running server on http://localhost:2000/");
})