import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <h1>Hello Dojo</h1>
    <h3>things i need to do:</h3>
    <ul>
      <li>Learn react</li>
      <li>climb mt everest</li>
      <li>run a marathon</li>
      <li>feed the fishes</li>
    </ul>
    </>
  )
}

export default App
