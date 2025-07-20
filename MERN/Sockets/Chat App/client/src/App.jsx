import './App.css'
import Chat from './components/Chat'
import {Routes , Route, useNavigate} from 'react-router-dom'
import Landing from './components/Landing'
function App() {

  const handleName = (name) =>{
    localStorage.setItem("name", name)
  }

  return (
    <>
    <h1>MERN CHAT</h1>
    <Routes>
      <Route path={"/"} element={<Landing handleName={handleName}/>}/>
      <Route path={"/chat"} element={<Chat/>}/>
    </Routes>
    </>
  )
}

export default App
