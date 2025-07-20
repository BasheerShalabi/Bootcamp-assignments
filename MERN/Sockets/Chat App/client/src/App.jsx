import { useState } from 'react'
import './App.css'
import Chat from './components/Chat'
import {Routes , Route} from 'react-router-dom'
import Landing from './components/Landing'
function App() {
  const [name, setName] = useState("")

  const handleName = (name) =>{
    setName(name)
  }
  return (
    <>
    <h1>MERN CHAT</h1>
    <Routes>
      <Route path={"/"} element={<Landing handleName={handleName}/>}/>
      <Route path={"/chat"} element={<Chat name={name}/>}/>
    </Routes>
    </>
  )
}

export default App
