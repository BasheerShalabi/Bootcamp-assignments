require('dotenv').config();
const express = require("express")
const app = express()
const port = process.env.PORT

app.use(express.json())

require("./config/mongoose.config")

require("./routes/joke.routes")(app)

app.listen(port)