import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Tabs from './components/Tabs'

function App() {
  const objects = [
    {label:"Tab1",content:"Tab 1 content is showing here"},
    {label:"Tab2",content:"Tab 2 content is showing here"},
    {label:"Tab3",content:"Tab 3 content is showing here"},
    {label:"Tab4",content:"Tab 4 content is showing here"}
  ]

  return (
    <>
     <Tabs arr={objects}/>
    </>
  )
}

export default App
