const mongoose = require('mongoose')
const username = process.env.ATLAS_USER
const pw = process.env.ATLAS_PASS
const dbName = process.env.DB_NAME
const uri = `mongodb+srv://${username}:${pw}@mycluster.whybaum.mongodb.net/${dbName}?retryWrites=true&w=majority`;
mongoose.connect(uri)
    .then(() => console.log("Established a connection to the database"))
    .catch(err => console.log("Something went wrong when connecting to the database", err));