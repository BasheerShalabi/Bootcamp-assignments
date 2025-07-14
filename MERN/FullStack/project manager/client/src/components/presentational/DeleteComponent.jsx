import React from 'react'

const DeleteComponent = (props) => {
    const {handleDelete} = props
  return (
    <button onClick={handleDelete}>Delete</button>
  )
}

export default DeleteComponent