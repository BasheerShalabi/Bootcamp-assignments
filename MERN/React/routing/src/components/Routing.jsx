import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'

const Routing = () => {
    const {msg, color, bgColor } = useParams()
    const [element, setElement] = useState()

    useEffect(()=>{
        if(!isNaN(msg)){
                setElement((<div>The Number is : {msg}</div>))
        }else{
            if(msg == "home"){
                setElement((<div>Welcome</div>))
            }else{
                setElement((<div style={{color:color!=undefined ? color : "inherit" , backgroundColor: bgColor!=undefined ? bgColor : "inherit" }}>The word is : {msg}</div>))
            }
        }
    },[])

    return (
        <>
            {element}
        </>
    )
}

export default Routing