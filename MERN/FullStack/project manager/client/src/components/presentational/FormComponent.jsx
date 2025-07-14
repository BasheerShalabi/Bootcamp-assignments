const FormComponent = (props) => {

    const {handleSubmit,handleChange,formData} = props

  return (
        <div className="container-fluid bg-light">
            <div className="row justify-content-center">
                <div className="col-lg-8 col-md-8 col-sm-10">
                    <form className="form-container" onSubmit={handleSubmit} >
                        <h4 className="text-center font-weight-bold">Create Product</h4>

                        <div className="form-floating mb-3">
                            <input type="text" className="form-control" id="floatingInput" placeholder="title" name="title" value={formData.title}
                                onChange={handleChange}
                            />
                            <label htmlFor="floatingInput">Title</label>
                        </div>

                        <div className="form-floating mb-3">
                            <input
                                type="number" className="form-control" id="floatingPrice" placeholder="price" name="price" value={formData.price}
                                onChange={handleChange}
                            />
                            <label htmlFor="floatingPrice">Price</label>
                        </div>

                        <div className="form-floating mb-3">
                            <input
                                type="text"
                                className="form-control" id="floatingDescription" placeholder="description" name="description" value={formData.description}
                                onChange={handleChange}
                            />
                            <label htmlFor="floatingDescription">Description</label>
                        </div>

                        <div className="form-group">
                            <button className="btn btn-primary btn-block">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
}

export default FormComponent