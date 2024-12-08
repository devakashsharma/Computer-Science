const http = require("http");

const server = http.createServer((req, res) => {
    if (req.method === "GET" && req.url === "/") {
        res.statusCode = 200;
        res.setHeader("content-type", "text/plain");
        res.end("Yooo, it's a Home Page, GET request");
    } else if (req.method === "POST" && req.url === "/submit") {
        let body = "";
        req.on("data", chunk => {
            body += chunk.toString();
        });

        req.on("end", () => {
            res.end(`Data Received: ${body}`);
        });
    } else {
        res.statusCode = 404;
        res.end("Page not found");
    }
});

server.listen(3000, () => {
    console.log("Server running at http://localhost:3000/");
});
