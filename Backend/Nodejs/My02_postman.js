const http = require("http");

const server = http.createServer((req, res) => {
    if (res.method === "GET" && res.url === "/") {
        res.statusCode = 200;
        res.setHeader("content-type", "text/plain");
        res.end("Yooo, it's a Home Page, Get request")
    } else if (res.method === "POST" && res.url === "/submit") {
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

server.listen(4000, () => {
    console.log("Server running at http://localhost:4000/");
})