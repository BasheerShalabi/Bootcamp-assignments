const express = require('express');
const app = express();
const cors = require('cors')
require('dotenv').config()
const PORT = process.env.PORT;

app.use(cors())
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const server = app.listen(PORT, () => console.log(`Server running on port ${PORT}`));

const io = require('socket.io')(server , {cors:true})

const messages = []


io.on('connection', socket => {
    console.log("Nice to meet you. (shake hand)")
    // socket.emit("Welcome","Connection successful , nice to meet you")

    socket.emit("Welcome", messages)
    socket.on("msg", data =>{
        // console.log(data)
        messages.push(data)
        io.emit("new_message" , messages)
    })
})