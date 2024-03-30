import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'

// lets check a bit more
function MyApp() {
  return (
    <h1>Custom App !</h1>
  )
}

// Creating a custom React!

// we can use this 
// const reactElement = {
//   type: "a",
//   props: {
//       href: "https://www.google.com/",
//       target: "_blank"
//   },
//   children: "click me to visit google",
// }

// we have follow a specific syntax for custom react
const ReactElement = React.createElement(
  'a',
  {
    href: "https://www.google.com/",
    target: "_blank"
  },
  "Click me to visit Google Baba"
)
ReactDOM.createRoot(document.getElementById('root')).render(
  // <React.StrictMode>
    // {/* <MyApp /> */}
    ReactElement
  // {/* </React.StrictMode>, */}

  /*
  // MyApp is a function we can run it by using () also
  <React.StrictMode>
    MyApp()
  </React.StrictMode>,
  */
)
