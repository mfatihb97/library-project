import ReactDOM from 'react-dom/client'
import './index.css'
import { App } from './App'
import { BrowserRouter } from 'react-router-dom'
import { loadStripe } from '@stripe/stripe-js'
import { Elements } from '@stripe/react-stripe-js'

const stripePromsie = loadStripe('pk_test_51PxxyhH07eaacoeXE3XWNmTXCwEfllc6KoSBYR1R8sJzmWgA5u1KqB7oERU8Y7DaeFZ3wyu34LLrdjsVdzzfQX3M0020frrsOa');

ReactDOM.createRoot(document.getElementById('root')!).render(
  <BrowserRouter>
    <Elements stripe={stripePromsie}>
      <App />
    </Elements>
  </BrowserRouter>,
)
