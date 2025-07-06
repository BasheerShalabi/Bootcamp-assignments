import { useState } from "react"


const Form = () =>{
    const [form,setForm] = useState({firstname:"" ,lastname:"",email:"",password:"",confirm:""})
    const [formErrors,setFormErrors] = useState({firstname:"" ,lastname:"",email:"",password:"",confirm:""})

    const handleChange = (e) =>{
        setForm({...form,[e.target.name]:e.target.value})
        setFormErrors({firstname:"" ,lastname:"",email:"",password:"",confirm:""})
        switch(e.target.name){
            case "firstname" : (e.target.value.length < 2)&&(e.target.value.length > 0) ? setFormErrors({...formErrors,[e.target.name]:"First name should be at least 2 characters!"})
                : setFormErrors({...formErrors,[e.target.name]:""}) ;break;
            case "lastname" : (e.target.value.length < 2)&&(e.target.value.length > 0) ? setFormErrors({...formErrors,[e.target.name]:"Last name should be at least 2 characters!"}) 
                : setFormErrors({...formErrors,[e.target.name]:""}); break;
            case "email" : (e.target.value.length < 5)&&(e.target.value.length > 0) ? setFormErrors({...formErrors,[e.target.name]:"Email should be at least 5 characters!"}) 
                : setFormErrors({...formErrors,[e.target.name]:""}); break;
            case "password" : (e.target.value.length < 8)&&(e.target.value.length > 0) ? setFormErrors({...formErrors,[e.target.name]:"Password should be at least 8 characters!"}) 
                : setFormErrors({...formErrors,[e.target.name]:""}); break;
            case "confirm" : (e.target.value != form.password)&&(e.target.value.length > 0) ? setFormErrors({...formErrors,[e.target.name]:"Passwords dont match!"}) 
                : setFormErrors({...formErrors,[e.target.name]:""}); break;
            default:break;
        }
    }
    return(
        <>
        <form>
            <label htmlFor="firstname">First Name</label>
            <input type="text" name="firstname" onChange={handleChange} />
            <p className="error">{formErrors.firstname}</p>
            <label htmlFor="lastname">Last Name</label>
            <input type="text" name="lastname" onChange={handleChange} />
            <p className="error">{formErrors.lastname}</p>
            <label htmlFor="email">Email</label>
            <input type="text" name="email" onChange={handleChange} />
            <p className="error">{formErrors.email}</p>
            <label htmlFor="password">Password</label>
            <input type="text" name="password" onChange={handleChange} />
            <p className="error">{formErrors.password}</p>
            <label htmlFor="confirm">Confirm Password</label>
            <input type="text" name="confirm" onChange={handleChange} />
            <p className="error">{formErrors.confirm}</p>
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