import { useState } from "react"

function ButtonChanger({ color, setColor, btnColor, textColor="white"}) {
  const handleClick = () => {
    setColor(color)
  };

  return (
    <button 
      onClick={handleClick}
      className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
      style={{backgroundColor: btnColor, color: textColor}}
        >{color}
    </button>
  )
}

function App() {
  const [color, setColor] = useState("white");

  return (
    <div className="w-full h-screen duration-200"
    style={{backgroundColor: color}}
    >
      <div className="fixed flex flex-wrap justify-center bottom-12 inset-x-0 px-2">
        <div className="flex flex-wrap justify-center gap-5 shadow-lg bg-white px-3 py-2 rounded-2xl">
          {/* <button 
          onClick={() => setColor("red")}
          className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "red"}}>Red</button>
          <button className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "Green"}}>Green</button>
          <button className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "blue"}}>Blue</button>
          <button className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "yellow", color: "black"}}>Red</button>
          <button className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "black"}}>Black</button>
          <button className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "lavender", color: "black"}}>Lavender</button>
          <button className="outline-none px-2.5 py-1 rounded-lg text-white shadow-sm"
          style={{backgroundColor: "red"}}>Red</button> */}
          <ButtonChanger color="Red" setColor={setColor} btnColor={"red"}/>
          <ButtonChanger color="Green" setColor={setColor} btnColor={"green"}/>
          <ButtonChanger color="Blue" setColor={setColor} btnColor={"blue"}/>
          <ButtonChanger color="Gray" setColor={setColor} btnColor={"gray"}/>
          <ButtonChanger color="Pink" setColor={setColor} btnColor={"pink"}/>
          <ButtonChanger color="Purple" setColor={setColor} btnColor={"purple"}/>
          <ButtonChanger color="Lavender" setColor={setColor} btnColor={"lavender"} textColor="black"/>
          <ButtonChanger color="Yellow" setColor={setColor} btnColor={"yellow"} textColor="black"/>
          <ButtonChanger color="White" setColor={setColor} btnColor={"white"} textColor="black"/>
          <ButtonChanger color="Black" setColor={setColor} btnColor={"black"}/>
        </div>
      </div>
    </div>
  )
}

export default App
