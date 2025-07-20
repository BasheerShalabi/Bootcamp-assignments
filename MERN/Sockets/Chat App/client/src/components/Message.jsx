
const Message = (props) => {
    const {message , isCurrentUser} = props
  return (
    <div className="p-2 mb-2">
        <div className={`d-flex ${isCurrentUser ? 'justify-content-end' : 'justify-content-start'}`}>
                <p className="small mb-1 text-muted">{new Date(message.date).toLocaleString()}</p>
        </div>
        <div className={`d-flex ${isCurrentUser ? 'justify-content-end' : 'justify-content-start'}`}>
                <p className="small mb-1 text-muted"><strong>{message.name}</strong></p>
        </div>
    <div className={`d-flex ${isCurrentUser ? 'justify-content-end' : 'justify-content-start'}`}>
      <div className={`p-2 rounded text-white ${isCurrentUser ? 'bg-primary' : 'bg-secondary'}`} style={{ maxWidth: '70%' }}>
        <div className={`d-flex flex-column justify-content-start ${isCurrentUser ? 'text-end' : 'text-start'}`}>
            
                {message.message.split('\n').map((msg, index) => (
                    <p key={index} className="small p-2 rounded-3">
                        {msg}
                    </p>
                ))}
            
        </div>
      </div>
    </div>
    </div>
  )
}

export default Message