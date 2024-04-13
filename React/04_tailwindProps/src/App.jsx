import { useState } from "react";
import "./App.css";
import "./index.css";
import Cards from "./component/Cards"

function App() {
  const [count, setCount] = useState(0);
  const myObj = {
    username: "akash_kun",
    age: 21,
  }
  const myArr = [1, 2, 3, 4, 5]

  return (
    <>
      <h1 className="bg-red-300 text-yellow p-5">Tailwind Testing!</h1>
      <Cards username="Akash Shamra" myNewObj={myObj} btnText={"click me"}/>
      <Cards username="Akash" myNewObj={myArr} btnText={"visit me"}/>
      <Cards username="Skywalker" />
    </>
  );
}

export default App;
