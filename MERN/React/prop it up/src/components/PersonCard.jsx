
const PersonCard = (props) => {
    const { firstName, lastName, age, hairColor } = props;
    return (
        <>
        <h1> {firstName} {lastName}</h1>
        <p>Age : {age}</p>
        <p>Hair Color : {hairColor}</p>
        </>
    )
}

export default PersonCard;