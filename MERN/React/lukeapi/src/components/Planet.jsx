
const Planet = (props) => {
    const {data} = props
  return (
    <>
        <h2>{data.name}</h2>
        <p>Climate: {data.climate}</p>
        <p>Terrain: {data.terrain}</p>
        <p>Surface Water : {data.surface_water}</p>
        <p>Population: {data.population}</p>
    </>
  )
}

export default Planet