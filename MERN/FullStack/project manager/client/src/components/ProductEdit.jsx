import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const ProductEdit = () => {
    const {id} = useParams()
    const [data,setData] = useState({})
    const navigate = useNavigate()

    
    const handleChange = (e) => {
        setData({ ...data, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(data);
        axios.patch(`http://localhost:3000/api/products/${id}`,data)
        .then(res=>{
            console.log(res.data)
            navigate("/products/"+id)
        })
        .catch(err=>{
            console.log(err)
        })
    };

    useEffect(()=>{
        axios.get(`http://localhost:3000/api/products/${id}`)
        .then(res=>{
            setData(res.data)
            console.log(data)
        })
        .catch(err=>{
            console.log(err)
        })
    },[])

  return (
    <>
    <form onSubmit={handleSubmit}>
        <label htmlFor="title">Title: </label>
        <input type="text" onChange={handleChange} name='title' value={data.title} />
        <label htmlFor="price">Price: </label>
        <input type="number" onChange={handleChange} name='price' value={data.price} />
        <label htmlFor="description">Description: </label>
        <textarea name="description" onChange={handleChange} value={data.description}></textarea>
        <input type="submit" value="Edit" />
    </form>
    </>
  )
}

export default ProductEdit