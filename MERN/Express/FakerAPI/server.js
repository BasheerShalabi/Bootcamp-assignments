const express = require("express")
const app = express()
const { faker } = require('@faker-js/faker');
const port = 8000
const createUser = () => {
    const firstname = faker.person.firstName()
    const lastname = faker.person.firstName()
    const newFakeUser = {
        id : faker.number.int(1000),
        firstname: firstname,
        lastname: lastname,
        email : faker.internet.email({firstName:firstname , lastName :lastname}),
        password : faker.internet.password(),
        phoneNumber : faker.phone.number()
    }

    return newFakeUser
}

const createCompany = () => {
    const newFakeCompany = {
        id : faker.number.int(100),
        name: faker.company.name(),
        address : {
            country : faker.location.country(),
            state : faker.location.state(),
            city : faker.location.city(),
            street : faker.location.street(),
            zipCode : faker.location.zipCode()
        }
    }

    return newFakeCompany
}

app.use(express.json());

app.get("/api/users/new" , (req ,res) => {
    res.json(createUser())
})
app.get("/api/companies/new" , (req ,res) => {
    res.json(createCompany())
})
app.get("/api/user/company" , (req ,res) => {
    res.json({user :createUser() , company : createCompany()})
})

app.listen(port)


