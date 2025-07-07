import { useState } from 'react'

const BoxGen = (props) => {
    const [elements,setElements] = useState([])
    const [color,setColor] = useState("")

    const handleClick = (e) =>{
        e.preventDefault()
        if(isValidColor(color)){
            setElements([...elements,(<div style={{width:"200px",height:"200px" , backgroundColor:color , margin:"3px"  , border: "1px solid black"}}></div>)])
            setColor("")
        }
    }
    
    props.box(elements)

    const handleChange = (e) =>{
        setColor(e.target.value)
    }

    const isValidColor = (color) =>{
        const check = new Option().style;
        check.color = color
        return check.color !== ''
    }
    
  return (
    <>
        <form onSubmit={handleClick}>
            <label htmlFor="color">Color</label>
            <input type="text" name="color" value={color} onChange={handleChange}/>
            <input type="submit" value="Add" />
        </form>
    </>
  )
}

export default BoxGen