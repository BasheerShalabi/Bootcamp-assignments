import { useState } from "react"

const Tabs = props => {
  const [content ,setContent] = useState("")

  const handleClick = (msg) =>{
    setContent(msg)
  }
  const buttons = props.arr.map(element => 
    (<button onClick={() => handleClick(element.content)}>{element.label}</button>)
  )
  return (
    <>
    <div className="buttons">{buttons}</div>
    <div className="container">{content}</div>
    </>
  )
}

export default Tabs