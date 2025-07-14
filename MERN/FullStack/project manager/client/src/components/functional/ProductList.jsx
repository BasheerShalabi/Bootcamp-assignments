import { useState } from "react";
import axios from "axios"
import { useEffect } from "react";
import { Link } from "react-router-dom"
const ProductList = () => {
    const [data,setData] = useState([])

    useEffect(()=>{
        axios.get("http://localhost:3000/api/products/allproducts")
        .then(res=>{
            setData(res.data)
            console.log("Success")
            console.log(res.data)
        })
        .catch(err=>{
            console.log(err)
        })
        
    },[])
    
    const list = data.map(((el,i)=>(<li key={i}><Link to={`/products/${el._id}`}>{el.title}</Link></li>)))

  return (
    <>
    <h1>All Products:</h1>
    <ul>
    {list}
    </ul>
    </>
  )
}

export default ProductList