import React, { useEffect, useState } from 'react'
import axios from 'axios'

const Pokemons = () => {
    const [pokemons,setPokemons] = useState([])
    
    const handleClick = () =>{
        axios.get("https://pokeapi.co/api/v2/pokemon/")
        .then(data =>{
            console.log(data.data.results)
            //setPokemons(data.results)
        })
        .catch(e=>{
            console.log(e)
        })

    }
    
    console.log(pokemons)
    
    const elements = pokemons.map(e=><li>{e.name}</li>)

  return (
    <>
    <button onClick={handleClick}>Fetch</button>
      <div>Pokemons</div>
      <ul>
        {elements}
      </ul>
    </>
  )
}

export default Pokemons