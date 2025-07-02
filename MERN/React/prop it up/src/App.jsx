import { useState } from 'react'
import './App.css'
import PersonCard from './components/PersonCard'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
      <PersonCard firstName="basheer" lastName="shalabi" age={25} hairColor="red"/>
    </>
  )
}

export default App
