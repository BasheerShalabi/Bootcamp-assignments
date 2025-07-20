import React from 'react'
import { useState } from 'react'
import {useNavigate} from 'react-router-dom'

const Landing = (props) => {
    const [name , setName] = useState("")
    const redirect = useNavigate()

    const handleSubmit = (e) =>{
        e.preventDefault()
        redirect('/chat')
    }

    props.handleName(name)
  return (
    <div>
        <h2> get started right now!!!</h2>
        <p>I want to start chatting with the name ...</p>
        <form onSubmit={handleSubmit}>
            <input type="text" name="name" placeholder='My name' onChange={(e)=>setName(e.target.value)} />
            <input type="submit" value="Start Chatting"/>
        </form>
    </div>
  )
}

export default Landing