const express = require("express");
const app = express();
const PORT = 3000;

// Middleware parse to json
app.use(express.json());

// Define Routes
// get
app.get("/", (req, res) => {
  res.send("Hello, world!");
});

// post
app.post("/submit", (req, res) => {
  const data = req.body;
  res.send(`Data Received: ${JSON.stringify(data)}`);
});

// add more routes
app.get("/about", (req, res) => {
  res.send(`Hey there`);
});

app.get("/user", (req, res) => {
  res.json([
    { id: 1, name: "john" },
    { id: 2, name: "alex" },
  ]);
});

app.use((req, res, next) => {
    console.log(`${req.method} ${req.url}`);
    next(); // Pass control to the next middleware
});


// handle errors
app.use((req, res) => {
  res.status(404).send(`Page not found`);
});

// start server
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
