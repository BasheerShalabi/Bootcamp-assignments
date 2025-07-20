import { useEffect, useRef } from 'react'
import EmojiPicker from 'emoji-picker-react';
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import io from 'socket.io-client'
import Message from './Message';
const Chat = () => {
  const [showPicker, setShowPicker] = useState(false);
  const name = localStorage.getItem("name")
  const redirect = useNavigate()
  const scrollDiv = useRef(null)

  if(name === ""){
    redirect('/')
  }
    const [socket] = useState( ()=> io(':8000') )
    const [messages , setMessages] = useState([])
    const [message , setMessage] = useState("")

    useEffect(()=>{
      if (scrollDiv.current) {
            scrollDiv.current.scrollTo({top:scrollDiv.current.scrollHeight, behavior: 'smooth'});
      }

      
      socket.on('Welcome', data =>{
        setMessages(data)
        })

          
        socket.on('new_message', data =>{
          setMessages(data)
        })

    },[socket,messages])

    const sendMsg = (e) =>{
      e.preventDefault()
      socket.emit("msg",{name: name , message: message , date: new Date().getTime()})
      setMessage("")
    }

    const handleEmojiClick = (emojiData) => {
    setMessage((prev) => prev + emojiData.emoji);
  };

    // const msgs = messages.map((el,id)=>
    //   <p key={id}>{el}</p>
    // )
const msgs = messages.map((el, id) => {
  const isCurrentUser = el.name === name; 

  return (
    <Message key={id} message={el} isCurrentUser={isCurrentUser} />
  );
});
    // console.log(messages)
  return (
    <div className="container mt-4">
      <div className="card">
        <div ref={scrollDiv} className="card-body" style={{ height: '400px', overflowY: 'scroll', backgroundColor: '#f8f9fa' }}>
          {msgs}
        </div>
        <div className="card-footer bg-white">
          <form onSubmit={sendMsg} className="d-flex flex-column gap-2">
            <div className="d-flex gap-2">
              <input
                type="text"
                className="form-control"
                placeholder="Type your message..."
                value={message}
                onChange={(e) => setMessage(e.target.value)}
              />
              <button
                type="button"
                className="btn btn-light"
                onClick={() => setShowPicker(!showPicker)}
              >
                😊
              </button>
              <button
                type="submit"
                className="btn btn-primary"
                disabled={message === ""}
              >
                Send
              </button>
            </div>
            {showPicker && (
              <EmojiPicker
                onEmojiClick={handleEmojiClick}
                height={300}
              />
            )}
          </form>
        </div>
      </div>
    </div>
  );
}

export default Chat