import { useState } from "react"


const Form = () =>{
    const [form,setForm] = useState({firstname:"" ,lastname:"",email:"",password:"",confirm:""})

    const handleChange = (e) =>{
        setForm({...form,[e.target.name]:e.target.value})
    }
    return(
        <>
        <form>
            <label htmlFor="firstname">First Name</label>
            <input type="text" name="firstname" onChange={handleChange} />
            <label htmlFor="lastname">Last Name</label>
            <input type="text" name="lastname" onChange={handleChange} />
            <label htmlFor="email">Email</label>
            <input type="text" name="email" onChange={handleChange} />
            <label htmlFor="password">Password</label>
            <input type="text" name="password" onChange={handleChange} />
            <label htmlFor="confirm">Confirm Password</label>
            <input type="text" name="confirm" onChange={handleChange} />
        </form>

        <div>
            <p>First Name :{form.firstname}</p>
            <p>Last Name :{form.lastname}</p>
            <p>Email :{form.email}</p>
            <p>Password :{form.password}</p>
            <p>Confirm Password :{form.confirm}</p>
        </div>
        </>
    )
}

export default Form