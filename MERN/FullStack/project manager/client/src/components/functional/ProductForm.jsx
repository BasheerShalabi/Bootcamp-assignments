import { useState } from "react";
import axios from "axios";
import FormComponent from "../presentational/FormComponent";
const ProductForm = () => {
    const [formData, setFormData] = useState({
        title: '',
        price: '',
        description: ''
    });

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(formData);
        axios.post("http://localhost:3000/api/products", formData)
            .then(res => {
                console.log(res.data.msg)
                console.log(res.data.product)
            })
            .catch(err => {
                console.log(err)
            })
    };

    return (
        <FormComponent handleChange={handleChange} handleSubmit={handleSubmit} formData={formData} />
    );
}

export default ProductForm