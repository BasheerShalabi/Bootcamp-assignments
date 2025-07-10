const Joke = require("../models/joke.model")

module.exports.findAllJokes = (req, res) => {

    Joke.find()

        .then((allJokes) => {

            res.json({ jokes: allJokes })

        })

        .catch((err) => {

            res.json(err)

        });

}

 

module.exports.findOneSingleJoke = (req, res) => {

    Joke.findOne({ _id: req.params.id })

        .then(oneSingleJoke => {

            res.json({ user: oneSingleJoke })

        })

        .catch((err) => {

            res.json(err)

        });}

 

module.exports.createNewJoke = (req, res) => {

    Joke.create(req.body)

        .then(newJoke => {

            res.json({ user: newJoke })

        })

        .catch((err) => {

            res.json(err)

        });}

 

module.exports.updateExistingJoke = (req, res) => {

    Joke.findOneAndUpdate(

        { _id: req.params.id },

        req.body,

        { new: true, runValidators: true }

    )

        .then(updatedJoke => {

            res.json({ user: updatedJoke })

        })

        .catch((err) => {

            res.json(err)

        });}

 

module.exports.deleteAnExistingJoke = (req, res) => {

    User.deleteOne({ _id: req.params.id })

        .then(result => {

            res.json({ result: result })

        })

        .catch((err) => {

            res.json(err)

        });}