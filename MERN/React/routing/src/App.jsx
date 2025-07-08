import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Routes , Route  } from 'react-router-dom'
import Routing from './components/Routing'

function App() {

  return (
    <>
    <Routes>
      <Route path="/:msg" element={<Routing/>}/>
      <Route path="/:msg/:color" element={<Routing/>}/>
      <Route path="/:msg/:color/:bgColor" element={<Routing/>}/>
    </Routes>
    </>
  )
}

export default App
