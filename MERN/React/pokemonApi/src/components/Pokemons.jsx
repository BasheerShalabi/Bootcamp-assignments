import React, { useEffect, useState } from 'react'

const Pokemons = () => {
    const [pokemons,setPokemons] = useState([])
    
    const handleClick = () =>{
        fetch("https://pokeapi.co/api/v2/pokemon/")
        .then(res => res.json())
        .then(data =>{
            setPokemons(data.results)
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