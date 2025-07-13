const mongoose = require('mongoose')

const ProductSchema = new mongoose.Schema({
    title:{
        type:String,
    required: [true, "Title is required."],
    minlength: [3, "Title must be more than 3 chars."],
    maxlength: [50, "Title cannot be greater than or equal 50 chars."],
    },
    price:{
        type:Number,
        required: [true, "Title is required."],
        min:[1,"Price must be at least 1"]
    },
    description:{
        type:String,
        required: false,
        minlength: [8, "Description must be more than 8 chars."],
        maxlength: [500, "Description cannot be greater than 500 chars."],
    }
})

const Product = mongoose.model('Product',ProductSchema)

module.exports = Product;