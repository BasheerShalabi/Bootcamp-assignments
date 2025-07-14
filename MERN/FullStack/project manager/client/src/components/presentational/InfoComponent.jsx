import React from 'react'

const InfoComponent = (props) => {
    const {data} = props
  return (
  <>
    <h1>{data.title}</h1>
    <p>Price: {data.price}</p>
    <p>Description: {data.description}</p>
  </>
  )
}

export default InfoComponent