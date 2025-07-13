import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ProductForm from './components/ProductForm'
import ProductList from './components/ProductList'
import { Routes,Route } from 'react-router-dom'
import ProductInfo from './components/ProductInfo'
import ProductEdit from './components/ProductEdit'

function App() {
  const [count, setCount] = useState(0)

  
  return (
    <>
    <Routes>
      <Route index element={(<> <ProductForm/> <ProductList/> </>)} />
      <Route path={"/products/:id"} element={<ProductInfo/>}/>
      <Route path={"/products/:id/edit"} element={<ProductEdit/>}/>
    </Routes>
      
    </>
  )
}

export default App
