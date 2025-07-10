const jokeController = require("../controllers/joke.controller")

module.exports = (app) =>{
    app.get("/api/jokes",jokeController.findAllJokes)
    app.get("/api/jokes/:id",jokeController.findOneSingleJoke)
    app.post("/api/jokes",jokeController.createNewJoke)
    app.patch("/api/jokes/:id",jokeController.updateExistingJoke)
    app.delete("/api/jokes",jokeController.deleteAnExistingJoke)
}