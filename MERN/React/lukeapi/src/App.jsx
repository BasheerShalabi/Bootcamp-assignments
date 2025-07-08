import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import SearchBar from './components/SearchBar'
import { Routes , Route } from 'react-router-dom'
import Planet from './components/Planet'
import Person from './components/Person'
import Species from './components/Species'
import StarShip from './components/StarShip'
import Vehicle from './components/Vehicle'

function App() {
  const [data, setData] = useState({})

  const handleData = (data) =>{
    setData(data)
  }

  return (
    <>
    <SearchBar pass={handleData}/>
    <Routes>
      <Route path='/planets/:id' element={<Planet data={data}/>}/>
      <Route path='/people/:id' element={<Person data={data}/>}/>
      <Route path='/species/:id' element={<Species data={data}/>}/>
      <Route path='/starships/:id' element={<StarShip data={data}/>}/>
      <Route path='/vehicles/:id' element={<Vehicle data={data}/>}/>
      <Route path='/404' element={<div> No Such thing</div>}/>
    </Routes>
    </>
  )
}

export default App
