const axios = require("axios");

axios.get("https://jsonplaceholder.typicode.com/posts/2")
    .then(respone => {
        console.log(respone.data)
    })
    .catch(error => {
        console.log(error);
    })