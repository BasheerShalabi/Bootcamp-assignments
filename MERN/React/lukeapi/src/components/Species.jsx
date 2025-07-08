
const Species = (props) => {
    const {data} = props
  return (
    <>
        <h2>{data.name}</h2>
        <p>Classification: {data.classification}</p>
        <p>Designation: {data.designation}</p>
        <p>Avg Life Span : {data.average_lifespan}</p>
        <p>Language: {data.language}</p>
    </>
  )
}

export default Species