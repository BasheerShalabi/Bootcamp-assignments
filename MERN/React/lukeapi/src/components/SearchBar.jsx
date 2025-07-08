import React, { useState } from 'react'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
const SearchBar = (props) => {
    const [select,setSelect] = useState("people")
    const [id,setId] = useState(0)

    const navigate = useNavigate()

    const handleSelect = (e) => {
        setSelect(e.target.value)
    }

    const handleChange = (e) =>{
        setId(e.target.value)
    }

    const handleSubmit = (e) =>{
        e.preventDefault()

        axios.get(`https://swapi.tech/api/${select}/${id}`)
        .then(data =>{
            console.log(data)
            props.pass(data.data.result.properties)
            navigate(`${select}/${id}`)
        })
        .catch(e => {
            console.log(e)
            navigate("/404")
        })
    }

  return (
    <div>
        <form onSubmit={handleSubmit}>
            <label htmlFor="search">Search for :</label>
            <select value={select} onChange={handleSelect} >
                <option value="people">People</option>
                <option value="planets">Planets</option>
                <option value="species">Species</option>
                <option value="starships">Starships</option>
                <option value="vehicles">Vehicles</option>
            </select>
            <label htmlFor="id">Id :</label>
            <input type="number" value={id} onChange={handleChange} />
            <input type="submit" value="Search" />
        </form>
    </div>
  )
}

export default SearchBar