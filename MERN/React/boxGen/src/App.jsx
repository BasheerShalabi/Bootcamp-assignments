import { useState } from 'react'
import BoxGen from './components/BoxGen'
import './App.css'

function App() {
  const [elements,setElements] = useState([])

  const getBoxes = (elements) =>{
    setElements(elements)
  }

  return (
    <>
      <BoxGen box={getBoxes}/>
      <div className='container'>
        {elements}
      </div>
    </>
  )
}

export default App
