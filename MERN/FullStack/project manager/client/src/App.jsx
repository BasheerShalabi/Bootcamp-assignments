import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ProductForm from './components/functional/ProductForm'
import ProductList from './components/functional/ProductList'
import { Routes,Route } from 'react-router-dom'
import ProductInfo from './components/functional/ProductInfo'
import ProductEdit from './components/functional/ProductEdit'

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
