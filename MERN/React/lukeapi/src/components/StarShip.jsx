
const StarShip = (props) => {
    const {data} = props
  return (
    <>
        <h2>{data.name}</h2>
        <p>Cargo: {data.cargo_capacity}</p>
        <p>Passengers: {data.passengers}</p>
        <p>Max Speed : {data.max_atmosphering_speed}</p>
        <p>Manufacturer: {data.manufacturer}</p>
    </>
  )
}

export default StarShip