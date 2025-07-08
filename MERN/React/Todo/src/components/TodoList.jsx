import { use, useState } from "react"
import Task from "./Task"

const TodoList = () => {
    const [tasks,setTasks] = useState([])
    const [content,setContent] = useState("")
    const [filter,setFilter] = useState([])

    const handleChange = (e) =>{
        setContent(e.target.value)
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        setTasks([...tasks,{content:content,status:false}])
    }

    const deleteTask=(content)=>{
        setFilter([...filter,content])
    }

    const elements = tasks.filter(t=>!filter.includes(t.content)).map(e=><ul><Task data={e} delete={deleteTask}/></ul>)

    return (
        <>
        <form onSubmit={handleSubmit}>
            <input type="text" value={content} onChange={handleChange}/>
            <input type="submit" value="Add" />
        </form>
        <div>TodoList</div>
        <ul>
           {elements}
        </ul>
        </>
    )
}

export default TodoList