import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
import { useParams } from 'react-router-dom'

const ProductInfo = () => {
    const {id} = useParams()
    const [data,setData] = useState({})
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
    </>
  )
}

export default ProductInfo