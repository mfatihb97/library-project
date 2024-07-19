import bookImage from './../../../Images/BooksImages/book-luv2code-1000.png';

export const ReturnBook = () => {
    return (
        <div className='col-xs-6 col-sm-6 col-md-4 col-lg-3 mb-3'>
            <div className='text-center'>
                <img
                    src={bookImage}
                    alt="book"
                    width='151'
                    height='233'
                />
                <h6 className='mt-2'>Book</h6>
                <p>Mufaba</p>
                <a className='btn main-color text-white' href="#">Reserve</a>
            </div>
        </div>
    )
}
