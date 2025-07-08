
const Vehicle = (props) => {
    const {data} = props
  return (
    <>
        <h2>{data.name}</h2>
        <p>Model: {data.model}</p>
        <p>Passengers: {data.passengers}</p>
        <p>Max Speed : {data.max_atmosphering_speed}</p>
        <p>Manufacturer: {data.manufacturer}</p>
    </>
  )
}

export default Vehicle