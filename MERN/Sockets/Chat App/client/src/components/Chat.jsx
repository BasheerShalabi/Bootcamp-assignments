import { useEffect } from 'react'
import { useState } from 'react'
import io from 'socket.io-client'
const Chat = (props) => {
    const [socket] = useState( ()=> io(':8000') )
    const [messages , setMessages] = useState([])
    const [message , setMessage] = useState("")
    const {name} = props

    useEffect(()=>{

        socket.on('Welcome', data =>{
            setMessages(data)
        })

        socket.on('new_message', data =>{
          
          setMessages(data)
         
        })


    },[])

    const sendMsg = (e) =>{
      e.preventDefault()
      socket.emit("msg",name + " : " + message)
      setMessage("")
    }

    const msgs = messages.map((el,id)=>
      <p key={id}>{el}</p>
    )
    // console.log(messages)
  return (
    <>
      <div>
        {msgs}
      </div>
      <form onSubmit={sendMsg}>
      <input type="text" value={message} onChange={(e)=>setMessage(e.target.value)} />
      <input type="submit" value="Send" />
      </form>
    </>
  )
}

export default Chat