const mongoose = require('mongoose');
const dbName = process.env.DB;
const username = process.env.ATLAS_USERNAME;
const pw = process.env.ATLAS_PASSWORD;
const clusterName = process.env.CLUSTER_NAME;
const uri = `mongodb+srv://${username}:${pw}@${clusterName.toLowerCase()}.whybaum.mongodb.net/${dbName}?retryWrites=true&w=majority`;
mongoose.connect(uri)
.then(() => console.log('Established a connection to the database'))
.catch(err => console.log('Something went wrong when connecting to the database', err));