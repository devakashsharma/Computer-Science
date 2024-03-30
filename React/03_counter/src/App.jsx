// import { useState } from 'react';
import { useState } from 'react'
import './App.css'

function App() {
  // let counter = 0;
  let [counter, setCounter] = useState(0);

  const incrementValue = () => {
    // counter = counter + 1;

    if (counter >= 0) {
      setCounter(counter + 1);
    }
  }

  const DecrementValue = () => {
    // counter = counter + 1;
    if (counter > 0) {
      setCounter(counter - 1);
    }
  }

  return (
    <>
      <h1>Counter App</h1>
      <h2>Count: {counter}</h2>

      <button
        onClick={incrementValue}
      >Increment</button>
      <button
        onClick={DecrementValue}
      >Decrement</button>
    </>
  )
}

export default App
