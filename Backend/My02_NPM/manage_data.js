const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
    if (req.method === 'GET' && req.url === '/notes') {
        const data = fs.readFileSync('./notes.json', 'utf-8');
        res.setHeader('Content-Type', 'application/json');
        res.end(data);
    } else if (req.method === 'POST' && req.url === '/notes') {
        let body = '';
        req.on('data', chunk => {
            body += chunk.toString();
        });
        req.on('end', () => {
            const notes = JSON.parse(fs.readFileSync('./notes.json', 'utf-8'));
            const newNote = JSON.parse(body);
            notes.push(newNote);
            fs.writeFileSync('notes.json', JSON.stringify(notes));
            res.end('Note added successfully');
        });
    } else {
        res.statusCode = 404;
        res.end('Not Found');
    }
});

server.listen(3000, () => {
    console.log('Server running at http://localhost:3000/');
});
