import { useState } from "react";

const PersonCard = (props) => {
    const { firstName, lastName, age, hairColor } = props;
    const [updatedAge,setUpdatedAge] = useState(age)
    return (
        <>
        <h1> {firstName} {lastName}</h1>
        <p>Age : {updatedAge}</p>
        <p>Hair Color : {hairColor}</p>
        <button onClick={()=>setUpdatedAge(updatedAge+1)}>increase age</button>
        </>
    )
}

export default PersonCard;