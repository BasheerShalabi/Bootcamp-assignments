import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { Link } from 'react-router-dom'

const ProductInfo = () => {
    const {id} = useParams()
    const [data,setData] = useState({})
    const navigate = useNavigate()

    const handleDelete = (e) =>{
        axios.delete(`http://localhost:3000/api/products/${id}`)
        .then(res=>{
            console.log(res.data)
            navigate("/")
        })
        .catch(err=>{
            console.log(err)
        })
    }

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
    <h1>{data.title}</h1>
    <p>Price: {data.price}</p>
    <p>Description: {data.description}</p>
    <Link to={`/products/${id}/edit`}>Edit</Link>
    <button onClick={handleDelete}>Delete</button>
    </>
  )
}

export default ProductInfo