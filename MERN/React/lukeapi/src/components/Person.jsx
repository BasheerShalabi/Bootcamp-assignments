import axios from "axios"
import { useEffect, useState } from "react"

const Person = (props) => {
    const {data} = props
    const [home,setHome] = useState("")

    useEffect(()=>{
    axios.get(data.homeworld)
    .then(data=>{
        setHome(data.data.result.properties.name)
    })
    .catch(e=>{
        setHome("Failed to Fetch")
        console.log(e)
    })

    },[])
  return (
    <>
        <h2>{data.name}</h2>
        <h3>Home: {home}</h3>
        <p>Height: {data.height}</p>
        <p>Mass: {data.mass}</p>
        <p>Hair Color: {data.hair_color}</p>
        <p>Skin Color: {data.skin_color}</p>
    </>
  )
}

export default Person