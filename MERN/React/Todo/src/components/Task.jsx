import { useState } from 'react'

const Task = (props) => {
    const {data} = props
    const [status , setStatus] = useState(false)
    const [style,setStyle] = useState((<span style={{textDecoration:"none"}}>{data.content}</span>))

    const handleToggle = (e) =>{
        setStatus(!status)
        if(!status){
            setStyle((<span style={{textDecoration:"line-through"}}>{data.content}</span>))
        }else{
            setStyle((<span style={{textDecoration:"none"}}>{data.content}</span>))
        }

    }

    const handleClick = () =>{
        props.delete(data.content)
    }
        

  return (
    <div>
        {style}
        <input type="checkbox" onChange={handleToggle}/>
        <button onClick={handleClick}>Delete</button>
    </div>
  )
}

export default Task